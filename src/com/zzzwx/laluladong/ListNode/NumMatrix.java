package com.zzzwx.laluladong.ListNode;

/**
 * @Description: 二维数组前缀和计算
 * @Author: zhuwenxing
 * @Date: 2026-01-11 09:49
 */

public class NumMatrix {

    // preSum[i][j] 记录矩阵 [0, 0, i-1, j-1] 的元素和
    private static int[][] preSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0)  return;
        preSum = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1]+ matrix[i-1][j-1]-preSum[i-1][j-1];
                System.out.println("i:"+i+",j:"+j+":"+preSum[i][j]);
            }
        }

    }
    // 计算子矩阵 [x1, y1, x2, y2] 的元素和
    public static int sumRegion(int x1, int y1, int x2, int y2) {
        // 目标矩阵之和由四个相邻矩阵运算获得
        return preSum[x2+1][y2+1] - preSum[x1][y2+1] - preSum[x2+1][y1] + preSum[x1][y1];
    }

    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        });

        System.out.printf(""+sumRegion(1,2,3,4));
    }
}

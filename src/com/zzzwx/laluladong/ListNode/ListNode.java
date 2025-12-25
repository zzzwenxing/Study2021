package com.zzzwx.laluladong.ListNode;

import java.util.Arrays;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public static ListNode createLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i = 1; i < arr.length; i++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // 单链表的遍历
        ListNode head = createLinkedList(new int []{1,2,3,4,5});
        for(ListNode cur = head; cur != null; cur = cur.next){
            System.out.println("单链表的遍历:"+cur.val);
        }

        // 单链表头部插入新元素
        ListNode head1 = createLinkedList(new int[]{5,4,3,2,1});
        ListNode newHead = new ListNode(0);
        newHead.next = head1;
        head1 = newHead;
        for(ListNode cur = head1; cur != null; cur = cur.next){
            System.out.println("单链表头部插入新元素" + cur.val);
        }

        // 单链表尾部插入新元素
        ListNode head2 = createLinkedList(new int[]{9,8,7,6,5,4,3,2,1});
        ListNode p =head2;
        while (p.next !=null){
            p=p.next;
        }
        p.next = new ListNode(0);

        for(ListNode cur = head2; cur != null; cur = cur.next){
            System.out.println("单链表尾部插入新元素" + cur.val);

        }

    }

}

/**
 * @author zhuwenxing
 * @ClassName hello
 * @date 2021-01-28 09:49
 * @description: hello
 * @version: 1.0
 */
public class hello {
    public static void main(String[] args) {
        /*String a = "abcdefghijklmnopq";
        String b = "";
        if(b==""){
            System.out.println("hahahaha");
        }
        System.out.println(b.substring(0,1));
        System.out.println(a.charAt(2));
        System.out.println(a.substring(3));
        System.out.println(a.substring(0,2));
        System.out.println("hello,2021");*/
        int[] a = {1,3,5,7};
        int b = searchInsert(a,9);
        System.out.println(b);

    }

    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;

    }
}

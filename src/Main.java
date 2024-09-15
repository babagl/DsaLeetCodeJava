import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        int[] nums1 = { 2,7,11,15};
        int target = 9;
        System.out.println("la Solution de "+ Arrays.toString(solution.twoSum(nums1, target)));
        System.out.println("Add Two number = "+ solution.addTwoNumbers(new ListNode(123), new ListNode(345)).toString());
    }
}
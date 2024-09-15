import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ;i++){
            int num = nums[i];
            int complement = target - num;
            if (numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(num, i);

        }
        return new int[]{};
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode p = l1 , q = l2  , curr = head;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0; // si p est different de null c = la valeur de listNode sinn = 0
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;

        }
        if(carry > 0) curr.next = new ListNode(carry);
        return head.next;
    }
}



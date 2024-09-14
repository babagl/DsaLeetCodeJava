import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = { 2,7,11,15};
        int target = 9;
        System.out.println("la Solution de "+ Arrays.toString(solution.twoSum(nums1, target)));
    }
}
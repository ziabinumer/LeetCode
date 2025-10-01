import java.util.Arrays;

public class TriangularSumOfArray {
    public static void main(String args[]) {
        int[] nums = {5};
        Solution sol = new Solution();
        System.out.println(sol.triangularSum(nums));
    }
}

class Solution {
    public int triangularSum(int[] nums) {
        int result = 0;
        int length = nums.length;
        while (length >= 1) {
            if (length == 1) return nums[0];
            for (int i = 0; i < length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            System.out.println(Arrays.toString(nums));
            length--;
        }

        return result;
    }
}

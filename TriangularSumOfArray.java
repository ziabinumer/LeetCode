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
        int n = nums.length;
        int result = 0;
        long coeff = 1; 

        for (int i = 0; i < n; i++) {
            result = (result + (int)(coeff * nums[i])) % 10;

            coeff = coeff * (n - 1 - i) / (i + 1);
        }

        return result;
    }
}


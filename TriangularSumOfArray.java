public class TriangularSumOfArray {
    public static void main(String args[]) {
        Solution sol = new Solution();
        System.out.println(sol.triangularSum(null));
    }
}

class Solution {
    public int triangularSum(int[] nums) {
        int result = 0;
        while (nums.length >= 1) {
            if (nums.length == 1) return nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return result;
    }
}

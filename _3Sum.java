import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class _3Sum {
    public static void main(String args[]) {
        int[] nums = {0, 0, 0};
        Solution sol = new Solution();
        System.out.println(sol.threeSum(nums));
    }
    
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        int l = 0, r = nums.length - 1;

        for (int i = 0; i < nums.length - 2; i++) {
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[l]);
                    subList.add(nums[i]);
                    subList.add(nums[r]);
                    list.add(subList);

                    l++;
                    r--;
                }
            }
        }

        return list;
    }
}

// 0, -1. -1, 1, 2, 4



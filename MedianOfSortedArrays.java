import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String args[]) {
        int[] nums = {1,2,3};
        int[] nums2 = {1,2,3, 15};
        Solution sol = new Solution();
        System.out.println(sol.findMedianSortedArrays(nums, nums2));
    }
    
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);

        Arrays.sort(mergedArr);

        int total = mergedArr.length;

        if (total % 2 == 1) {
            return mergedArr[total / 2];
        }
        else {
            int mid1 = mergedArr[total / 2 - 1];
            int mid2 = mergedArr[total / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
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
        int total = nums1.length + nums2.length;
        int[] mergedArr = new int[total];

        int l = 0, r = 0, i = 0;

        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] <= nums2[r]) {
                mergedArr[i]  = nums1[l];
                l++; i++;
            }
            else {
                mergedArr[i] = nums2[r];
                r++; i++;
            }
        }

        while (l < nums1.length) {
            mergedArr[i] = nums1[l];
            l++;i++;
        }

        while (r < nums2.length) {
            mergedArr[i] = nums2[r];
            r++;i++;
        }


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
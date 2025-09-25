public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5, 2, 6};
        System.out.println(Solution.maxArea(arr));
    }
}


class Solution {
    public static int maxArea(int[] height) {
        int result = 0;


        // for (int l = 0; l < height.length; l++) {
        //     for (int r = l + 1; r < height.length; r++) {
        //         int area = (r - l) * Math.min(height[l], height[r]);
        //         result = Math.max(area, result);
        //     }
        // }

        int l = 0, r = height.length - 1;

        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            result = Math.max(area, result);
            if (height[l] > height[r]) {
                r--;
            }
            else {
                l++;
            }
            
        }


        return result;
    }
}

/*
 * 
 * [1,2,3,4,5,6,7,8]
 * [3, 1, 2, 4, 5, 2, 6]
 * 
 */

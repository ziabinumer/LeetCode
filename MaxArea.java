public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(Solution.maxArea(arr));
    }
}


class Solution {
    public static int maxArea(int[] height) {
        int result = 0;

        for (int l = 0; l < height.length; l++) {
            for (int r = l + 1; r < height.length; r++) {
                int area = (r - l) * Math.min(height[l], height[r]);
                result = Math.max(area, result);
            }
        }


        return result;
    }
}

public class WaterBottles {
    public static void main(String args[]) {
        Solution sol = new Solution();
        System.out.println(sol.numWaterBottles(9, 3));
    }
}

class Solution {
    public int numWaterBottles(int numWaterBottles, int numExchange) {
        int maxBottles = numWaterBottles;

        while (numWaterBottles >= numExchange) {
            maxBottles += numWaterBottles / numExchange;
            numWaterBottles = numWaterBottles % numExchange + (numWaterBottles / numExchange);
        }

        return maxBottles;
    }
}

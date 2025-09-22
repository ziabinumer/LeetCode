public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(Solution.reverse(983));
    }
}

class Solution {
    public static int reverse(int x) {
        int newNum = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // to ensure the newNum stays between the standard int range
            if (newNum > Integer.MAX_VALUE
                || newNum == Integer.MAX_VALUE && digit > 7) {
                    return 0;
                }
            if (newNum < Integer.MIN_VALUE 
                || newNum == Integer.MIN_VALUE && digit < -8) {
                    return 0;
                }

            newNum = newNum * 10 + digit;
        }


        return newNum;
    }
}

/*
 * 
 * 
 * 589
 * 9 
 * 
 */

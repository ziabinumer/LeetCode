public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(Solution.reverse(983));
    }
}

class Solution {
    public static int reverse(int x) {
        int newNum = 0;

        while (x != 0) {
            newNum = newNum * 10 + x % 10;
            x /= 10;
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

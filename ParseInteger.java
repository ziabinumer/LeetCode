public class ParseInteger {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi(args[0]));
    }
}

class Solution {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        long number = 0;
        int startIndex = 0, sign = 1;

        while (startIndex < s.length() && s.charAt(startIndex) == ' ') {
            startIndex++;
        }

        if (startIndex == s.length()) return 0;

        if (s.charAt(startIndex) == '-') {
            sign = -1;
            startIndex++;
        }
        else if (s.charAt(startIndex) == '+') {
            startIndex++;
        }
        for (int i = startIndex; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) break;

            number = number * 10 + (c - '0');

            if (sign == 1 && number > Integer.MAX_VALUE) return Integer.MAX_VALUE - 1;
            if (sign == -1 && number < Integer.MIN_VALUE) return Integer.MIN_VALUE - 1;
        }

        
        
        return (int) (number * sign);
    }
}



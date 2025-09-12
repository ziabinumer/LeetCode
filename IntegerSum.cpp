class Solution {
public:
    bool nonZero(int n) {
        while (n) {
            if (n % 10 == 0) return false;
            n /= 10;
        }
        return true;
    }
    vector<int> getNoZeroIntegers(int n) {
        int start = n / 2;
        int end = n - n / 2;

        while (!(nonZero(start) && nonZero(end))) {
            start++; end--;
        }
        return {start, end};

    }
};
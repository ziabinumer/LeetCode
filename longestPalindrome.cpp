#include <iostream>
using namespace std;

string longestPalindrome(string s) {
    int len = s.length();
    if (len == 1) return s;
    int middle = len / 2;
    string subStr = "";
    if (len % 2 == 0) {
        int leftMiddle = middle - 1;
        if (s[leftMiddle] == s[middle]) {
            subStr = s.substr(leftMiddle, 2);
            for (int i = 1; middle + i < len && leftMiddle - i >= 0; i++) {
                if (s[leftMiddle - i] == s[middle + i]) {
                subStr = s.substr(leftMiddle - i, 2 * i + 2);
                }
                else return subStr;
            }
        }
        else {
            return string(1, s[leftMiddle]);
        }
    }
    else {
        
        for (int i = 1; middle - i >= 0 && middle + i < len; i++) {
            if (s[middle - i] == s[middle + i]) {
                subStr = s.substr(middle - i, 2 * i + 1);
            }
            
        }
    }
    
    return subStr;
}


int main(int argc, char* argv[]) {
    if (argc != 2) {
        cout << "Expected exactly one argument\n";
        return 1;
    }

    string s = argv[1];
    s = longestPalindrome(s);

    cout << "longest palindrome: " << s << endl;

    return 0;
}
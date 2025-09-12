#include <iostream>
using namespace std;

string longestPalindrome(string s) {
    if (s.length() == 1) return s;
    string palindrome = string(1, s[0]);
    // {'a', 'b', 'b' a}
    for (int i = 0; i < s.length(); i++) {
        int left, right;
        left = i;
        right = i + 1;
        
        while (left >= 0 && right < s.length()) {
            if (s[left] == s[right]) {
                string candidate = s.substr(left, right - left + 1);
                if (candidate.length() > palindrome.length())
                    palindrome = candidate;
                left--; right++;
                
            }
            else {
                break;
            }
        }

        left = i - 1;
        right = i + 1;

        while (left >= 0 && right < s.length()) {
            if (s[left] == s[right]) {
                string candidate = s.substr(left, right - left + 1);
                if (candidate.length() > palindrome.length())
                    palindrome = candidate;
                left--; right++;
                
            }
            else {
                break;
            }
        }
    }
    return palindrome;
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
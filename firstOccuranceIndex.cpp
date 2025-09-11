class Solution {
public:
    int strStr(string haystack, string needle) {
        if (needle == "") return 0;
        int needleLen = needle.length();
        for (int i = 0; i <= haystack.length() - needle; i++) {
            if (needle == haystack.substr(i, needleLen)) {
                return i;
            }
        }
        return -1;
    }
};
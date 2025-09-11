class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";
        int minLength = strs[0].length();
        string prefix = "";
        for (auto str: strs) {
            if (str.length() < minLength) minLength = str.length();
        }


        int i = 0; int arraySize = strs.size();
        while (i < minLength) {
            char c = strs[0][i];
            for(int j = 1; j < arraySize; j++) {
                if (strs[j][i] != c) {
                    return prefix;
                }
            }
            prefix += c;
            i++;
        }
        return prefix;
    }
};
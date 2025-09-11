class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int num = nums.at(0); int size = nums.size();
        for (int i = 1; i < size; i++) {
            if (num == nums.at(i)) {
                nums.erase(nums.begin() + i);
                i--; size--;
            }
            else num = nums.at(i);
        }
        return nums.size();
    }
};
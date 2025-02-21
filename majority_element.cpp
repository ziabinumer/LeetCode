#include <iostream>
#include <vector>
using namespace std;


int majorityElement(vector<int>& nums) {
    int size = nums.size();

    int freq = 0, majElement = 0;

    for (auto num : nums) {
        if (freq == 0) {
            majElement = num;
            freq = 1;
        }
        else if (majElement == num) freq++;
        else if (majElement != num) freq--;
    }
    return majElement;
}


int main() {
    vector<int> nums;
    nums.push_back(2);
    nums.push_back(2);
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(2);

    cout << majorityElement(nums) << endl;

    return 0;
}

#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;


class Solution {
public:

    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> map;

         return recursive(nums, target, 0, map );

    }
private:

    vector<int> recursive(vector<int>& nums, int target, int i, unordered_map<int,int>& map){
        int sNum = target - nums[i];

        if(map.find(sNum) != map.end()){
            return {map[sNum],i};
        }
        map[nums[i]] = i;
        //map.insert({nums[i],i});
        return recursive(nums, target, i+1, map);

    }

};

    int main(){
        Solution sol;
        vector<int> nums = {0, 2, 3, 4, 5, 0};

        int target =0;

        vector<int> ans =sol.twoSum(nums, target);
        
        for(int i =0; i < ans.size(); i++)
            cout << ans[i] << " ";

        cout<< endl;

        return 0;
    }
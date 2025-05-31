//Using Brute Force Approach
//Time Complexity=O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Nested Loop
        for(int i=0;i<nums.length;i++){
            for(int j=(i+1);j<nums.length;j++){
               //conditions
               if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
               }
            }
        }
                return null;
        
    }
}

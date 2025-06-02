//Time complexity=O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        //0>Conditions
        if(nums.length<=1){
              return nums.length;
        }
        int index=1;
        //1>Apply for-Loop
        for(int i=1;i<nums.length;i++){
             //conditions
             if(nums[index-1]!=nums[i]){
                 nums[index]=nums[i];
                 index++;
             }
        }
        return index;
    }
}

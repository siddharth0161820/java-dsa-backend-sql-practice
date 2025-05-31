//Time Complexity=O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap
        HashMap<Integer,Integer>map=new HashMap<>();
        //Loop
        for(int i=0;i<nums.length;i++){
             int currentNumber=nums[i];
             int complement=target-currentNumber;
             if(map.containsKey(complement)){
                  return new int[]{map.get(complement),i};
             }else{
                 map.put(currentNumber,i);
             }
        }
        return null;
    }
}

package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimalHashMapApproach {
    public static int[] twoSumOptimalHashMapApproach(int[]nums,int target) {
        //Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNum=target-nums[i];
            //Conditions
           if (map.containsKey(requiredNum)){
               int[]result={map.get(requiredNum),i};
               return result;
           }
               map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[]nums={3,2,4};
        int target=6;
        int[] result=twoSumOptimalHashMapApproach(nums,target);
        System.out.println("Optimal HashMap Output: "+ Arrays.toString(result));
    }
}


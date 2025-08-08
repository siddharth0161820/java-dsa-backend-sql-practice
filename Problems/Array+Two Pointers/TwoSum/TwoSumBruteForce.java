package TwoSum;

import java.util.Arrays;
//Using Brute Force Approach
//Time Complexity=O(n^2)
public class TwoSumBruteForce {
    public static int[] twoSumBruteForce(int[]num, int target){

        for (int i = 0; i< num.length ; i++) {
            for (int j = (i+1); j < num.length ; j++) {
                //Conditions
                if (num[i]+num[j]==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[]num={2,7,11,15};
        int target=9;
        int[] result=twoSumBruteForce(num,target);
        System.out.println("Brute Force Output: "+ Arrays.toString(result));
    }
}

package MaximumSubarray;
//Time Complexity=O(n)
//Space Complexity=O(1)
//Kadane's algorithm Approach

public class MaximumSubArray {
    //Method()
    public static int maximumSubArray(int[]nums){
        //For loop
        int sum=nums[0];
        int maxSum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum=Math.max(nums[i],sum+nums[i]);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("MaxSum: "+maximumSubArray(nums));
    }
}

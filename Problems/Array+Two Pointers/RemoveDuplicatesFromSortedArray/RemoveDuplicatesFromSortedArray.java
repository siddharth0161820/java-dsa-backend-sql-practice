package RemoveDuplicatesFromSortedArray;
//Time Complexity=O(n)
//Space Complexity=O(1)
//Single Pointer Overwrite Approach or Filtered write approach
public class RemoveDuplicatesFromSortedArray {
    //Methods()
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            //Conditions
            if(i< nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else {
                nums[count]=nums[i];
                 count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println("The Output as Count is "+removeDuplicatesFromSortedArray(nums));

    }
}

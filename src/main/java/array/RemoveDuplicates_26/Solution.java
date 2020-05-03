package array.RemoveDuplicates_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return nums.length;

        int result = 1;
        int toInsert = 1;
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(prev != nums[i]){
                nums[toInsert++] = nums[i];
                prev = nums[i];
                result++;
            }
        }
        return result;
    }
}

package array.Movezeros_283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length && i < nums.length){
            if(nums[i] != 0){
                i++;
            }
            if(nums[j] == 0){
                j++;
            } else{
                if(nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                } else{
                    j++;
                }
            }
        }

    }

    public void moveZeroes2(int[] nums) {
        int pointer = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pointer++] = nums[i];
            }
        }

        if(pointer < nums.length){
            for(int i = pointer; i < nums.length; i++){
                nums[i] = 0;
            }
        }


    }
}

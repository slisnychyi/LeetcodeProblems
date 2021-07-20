package array.RemoveDuplicates_26;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return nums.length;

        int prev = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[prev] != nums[i]) {
                nums[++prev] = nums[i];
            }
        }
        return prev + 1;
    }
}

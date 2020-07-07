package contest.june;


import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {1,2};
        new SortColors().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }


    public void sortColors(int[] nums) {
        //int zero = 0;
        int two = nums.length;
        // int one = two - 1;



        for(int i = 0; i <= two;){
            if(nums[i] == 2) {
                int tmp = nums[two];
                nums[two] = 2;
                nums[i] = tmp;
                two--;
            }
            else if(nums[i] == 0){
                nums[i++] = 0;
            }
            else if(nums[i] == 1){
                int tmp = nums[two - 1];
                nums[two - 1] = 1;
                nums[i] = tmp;
                two--;
            }





        }


    }
}

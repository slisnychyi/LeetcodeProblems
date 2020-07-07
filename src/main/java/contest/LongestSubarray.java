package contest;

import java.util.Arrays;

public class LongestSubarray {

    public static void main(String[] args) {
        Arrays.asList(
                new int[]{1,1,0,1},
                new int[]{0,1,1,1,0,1,1,0,1},
                new int[]{1,1,1},
                new int[]{1,1,0,0,1,1,1,0,1},
                new int[]{0,0,0}
        ).forEach(e -> {
            System.out.println(new LongestSubarray().longestSubarray(e));
        });

    }

    public int longestSubarray(int[] nums) {
        int skip = 1;
        int maxCounter = 0;
        int counter = 0;
        int toReturn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (skip == 1) {
                    skip--;
                    toReturn = i;
                } else {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                    counter = 0;
                    skip = 1;
                    i = toReturn;
                }
            } else {
                counter++;
            }
        }
        if (counter > maxCounter) {
            maxCounter = counter == nums.length ? counter - 1 : counter;
        }
        return maxCounter;
    }
}

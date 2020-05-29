package array.decompressedList_1313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Solution {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2){
            for(int j = 0; j < nums[i]; j++){
                res.add(nums[i+1]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();

    }

    public int subtractProductAndSum(int n) {
        List<Integer> values = new ArrayList<>();
        while(n != 0){
            values.add(n % 10);
            n /= 10;
        }

        int product = values.stream().reduce((a, b) -> a * b).orElse(0);
        int sum = values.stream().mapToInt(Integer::intValue).sum();

        return product - sum;


    }

}

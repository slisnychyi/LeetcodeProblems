package array.CreateTargetInt_1389;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }
        objects.add(2, 999);
        System.out.println(objects);
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            int value = nums[i];
            int indx = index[i];
            result.add(indx, value);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}



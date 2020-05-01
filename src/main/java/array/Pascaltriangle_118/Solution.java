package array.Pascaltriangle_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> toAdd = new ArrayList<>();
            toAdd.add(1);

            int left = 0;
            int right = 1;
            while (right <= prev.size() - 1){
                toAdd.add(prev.get(left) + prev.get(right));
                left++;
                right++;
            }

            toAdd.add(1);
            result.add(toAdd);
        }
        return result;
    }

}

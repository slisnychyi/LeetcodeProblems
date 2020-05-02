package contest;

import java.util.ArrayList;
import java.util.List;

public class Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int val : candies) {
            result.add(val + extraCandies >= max);
        }
        return result;
    }
}

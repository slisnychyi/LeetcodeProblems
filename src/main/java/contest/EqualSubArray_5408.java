package contest;

import java.util.HashMap;
import java.util.Map;

public class EqualSubArray_5408 {

    public static void main(String[] args) {
        System.out.println(new EqualSubArray_5408().canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    }


    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> vals = new HashMap<>();
        for (int value : target) {
            vals.compute(value, (key, val) -> val == null ? 1 : val + 1);
        }
        for (int value : arr) {
            if (vals.get(value) != null) {
                int count = vals.get(value);
                if (count == 0) return false;
                vals.put(value, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }

}

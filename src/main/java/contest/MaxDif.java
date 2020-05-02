package contest;

import java.util.ArrayList;
import java.util.List;

public class MaxDif {

    public int maxDiff(int num) {
        int a = getA(num);
        int b = getB(num);
        return a - b;
    }

    int getA(int value) {
        StringBuilder result = new StringBuilder();
        Integer[] values = getValues(value);
        boolean added = false;
        int changedValue = -1;
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] != 9 && !added) {
                changedValue = values[i];
                values[i] = 9;
                added = true;
                result.append(values[i]);
                continue;
            }
            if(added && values[i] == changedValue){
                values[i] = 9;
            }
            result.append(values[i]);
        }
        return Integer.parseInt(result.toString());
    }

    int getB(int value) {
        StringBuilder result = new StringBuilder();
        Integer[] values = getValues(value);
        boolean added = false;
        int changedValue = -1;
        int changed = 0;
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] != 1 && values[i] != 0 && !added) {
                changedValue = values[i];
                values[i] = i == values.length - 1 ? 1 : 0;
                changed = values[i];
                added = true;
                result.append(values[i]);
                continue;
            }
            if(added && values[i] == changedValue){
                values[i] = changed;
            }
            result.append(values[i]);
        }
        return Integer.parseInt(result.toString());
    }

    private Integer[] getValues(int value) {
        List<Integer> result = new ArrayList<>();
        while (value > 0) {
            result.add(value % 10);
            value /= 10;
        }
        Integer[] res = new Integer[result.size()];
        res = result.toArray(res);
        return res;
    }


}

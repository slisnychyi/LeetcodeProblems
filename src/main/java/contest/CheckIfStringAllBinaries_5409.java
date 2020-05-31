package contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckIfStringAllBinaries_5409 {

    public boolean hasAllCodes(String s, int k) {
        if (s.length() < Math.pow(2, k)) return false;

        Set<String> values = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, k + i);
            values.add(substring);
        }

        List<String> result = new ArrayList<>();
        fill(result, "", k);
        for (String s1 : result) {
            if(!values.contains(s1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckIfStringAllBinaries_5409().hasAllCodes("0000000001011100", 4));
    }

    public void fill(List<String> values, String val, int k) {
        if (k == 0) {
            values.add(val);
            return;
        }
        fill(values, val + "0", k - 1);
        fill(values, val + "1", k - 1);
    }


}

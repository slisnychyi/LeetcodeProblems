package contest.may;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> values = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            values.compute(c, (key, value) -> value == null ? 1 : value + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            Integer val = values.get(c);
            if (val != null && val > 0) {
                values.put(c, val - 1);
            } else {
                return false;
            }

        }
        return true;
    }

}

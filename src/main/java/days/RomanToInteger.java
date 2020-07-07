package days;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("IV"));
    }

    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (map.get(chars[i]) < map.get(chars[i + 1]))
                sum -= map.get(chars[i]);
            else
                sum += map.get(chars[i]);
        }
        return sum + map.get(chars[chars.length - 1]);
    }


}

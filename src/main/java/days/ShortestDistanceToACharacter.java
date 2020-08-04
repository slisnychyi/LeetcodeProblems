package days;

import java.util.Arrays;

public class ShortestDistanceToACharacter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShortestDistanceToACharacter().shortestToChar("loveleetcode", 'e')));
    }

    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        char[] chars = S.toCharArray();
        int counter = 1;
        for (int i = 0; i < S.length(); i++) {
            if (chars[i] != C) {
                result[i] = counter++;
            } else {
                counter = 1;
            }
        }
        counter = S.length();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (result[i] == 0) {
                counter = 1;
            } else {
                if (counter <= result[i] || i == 0) {
                    result[i] = counter++;
                }
            }
        }
        return result;
    }
}

package array;

import java.util.Arrays;

public class IncreasingdecreasingString {

    public static void main(String[] args) {
        System.out.println(new IncreasingdecreasingString().sortString("aaaabbbbcccc"));
    }

    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        boolean forw = true;
        while (res.length() != s.length()) {
            if (forw) {
                char prev = 0;
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != 0 && chars[i] != prev) {
                        res.append(chars[i]);
                        prev = chars[i];
                        chars[i] = 0;
                    }
                }
                forw = false;
            } else {
                char prev = 0;
                for (int i = chars.length - 1; i >= 0; i--) {
                    if (chars[i] != 0 && chars[i] != prev) {
                        res.append(chars[i]);
                        prev = chars[i];
                        chars[i] = 0;
                    }
                }
                forw = true;
            }
        }
        return res.toString();
    }

}

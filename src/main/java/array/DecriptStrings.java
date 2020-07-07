package array;

public class DecriptStrings {

    public static void main(String[] args) {
        System.out.println(new DecriptStrings().freqAlphabets("10#11#12"));
    }

    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(i < chars.length - 2 && chars[i + 2] == '#'){
                int t = (char) Integer.parseInt(chars[i] + "" + chars[i+1]);
                res.append((char) (t + 96));
                i += 2;
            } else {
                int aChar = Integer.parseInt(String.valueOf(chars[i]));
                res.append((char) (aChar + 96));
            }
        }
        return res.toString();
    }
}

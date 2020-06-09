package array;

import java.util.Stack;

public class ReverseWordsInString_557 {

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString_557().reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            res.append(reverse(words[i]));
            if(i != words.length - 1) res.append(" ");
        }
        return res.toString();
    }

    private String reverse(String word) {
        char[] chars = word.toCharArray();
        int s = 0;
        int l = word.length() - 1;
        while (s < l){
            char t = chars[s];
            chars[s++] = chars[l];
            chars[l--] = t;
        }
        return new String(chars);
    }


}

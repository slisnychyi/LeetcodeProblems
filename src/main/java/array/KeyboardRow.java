package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class KeyboardRow {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new KeyboardRow().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> dict = Set.of("qwertyuiop","asdfghjkl","zxcvbnm");
        for(String word : words){
            String tmp = ""+word.toLowerCase();
            char[] chars = tmp.toLowerCase().toCharArray();
            String d = dict.stream().filter(e-> e.contains(String.valueOf(chars[0]))).findFirst().orElseThrow();
            boolean exists = true;
            for(char c : chars){
                    if(!d.contains("" + c)) {
                        exists = false;
                        break;
                    }
            }
            if(exists) res.add(word);
        }
        return res.toArray(String[]::new);

    }
}

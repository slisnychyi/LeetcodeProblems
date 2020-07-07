package array;

import java.util.Arrays;

public class StringMatch {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new StringMatch().diStringMatch("IDID")));
    }

    public int[] diStringMatch(String S) {
        int i = 0;
        int d = S.length();
        int[] res = new int[S.length() + 1];
        char last = 0;
        for(int j = 0; j < res.length - 1; j++){
            last = S.charAt(j);
            if(S.charAt(j) == 'I') res[j] = i++;
            if(S.charAt(j) == 'D') res[j] = d--;
        }
        res[res.length - 1] = last == 'I' ?  i : d;
        return res;
    }


}

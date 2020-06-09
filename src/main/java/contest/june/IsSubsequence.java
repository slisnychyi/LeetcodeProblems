package contest.june;

import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("", "aaa"));
    }

    public boolean isSubsequence(String s, String t) {
        Queue<Character> q = new LinkedList<>();
        for(char c : s.toCharArray()) q.add(c);
        for(char c : t.toCharArray()) if(q.size() > 0 && q.peek() == c) q.poll();
        return q.size() == 0;
    }
}

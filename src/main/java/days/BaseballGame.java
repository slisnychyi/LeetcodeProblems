package days;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> values = new Stack<>();
        for(String c: ops){
            if(c.equals("C")){
                values.pop();
            }
            if(c.equals("D")){
                values.push(values.peek() * 2);
            }
            if(c.equals("+")){
                values.push(values.pop() + values.pop());
            } else {
                values.push(Integer.valueOf(c));
            }
        }
        int res = 0;
        for(int v : values){
            res += v;
        }
        return res;
    }
}

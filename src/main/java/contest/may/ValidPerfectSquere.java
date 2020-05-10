package contest.may;

import java.util.HashMap;
import java.util.Map;

public class ValidPerfectSquere {


    public static void main(String[] args) {
        new ValidPerfectSquere().isPerfectSquare(2147483647);
    }

    Map<Integer, Integer> vals = new HashMap<>();

    public boolean isPerfectSquare(int num) {
        collect(num);
        for(int val : vals.values()){
            if(val % 2 != 0) return false;
        }
        return true;
    }

    void collect(int num){
        if(num != 0){
            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    vals.compute(i, (k, v) -> v == null ? 1 : v + 1);
                    collect(num / i);
                    break;
                }
            }

        }
    }

}

package contest.may;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElem {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() / 2 > 0){
                if((entry.getValue() / 2 + entry.getValue() % 2) > max){
                    res = entry.getKey();
                    max = entry.getValue() / 2 + entry.getValue() % 2;
                }
            }
        }
        return res;
    }
}

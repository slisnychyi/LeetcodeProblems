package contest;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckLength_5401 {

    public boolean kLengthApart(int[] nums, int k) {
        int oneIndex = 0;
        while(oneIndex < nums.length) {
            if(nums[oneIndex] == 1){
                int i1 = oneIndex + k;
                if(i1 < nums.length){
                    for(int i = oneIndex + 1; i <= i1; i++){
                        if(nums[i] == 1) return false;
                    }
                } else {
                    for(int i = oneIndex + 1; i < nums.length; i++){
                        if(nums[i] == 1) return false;
                    }
                    return true;
                }
                oneIndex = i1 + 1;
            } else {
                oneIndex++;
            }
        }
        return true;
    }

    public String destCity(List<List<String>> paths) {

        Map<String, String> values = new HashMap<>();
        for(List<String> p : paths){
            values.put(p.get(0), p.get(1));
        }
        for(String d : values.values()){
            if(values.get(d) == null) return d;
        }
        return null;

    }

}

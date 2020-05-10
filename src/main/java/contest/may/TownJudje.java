package contest.may;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TownJudje {

    public int findJudge(int N, int[][] trust) {
        Map<Integer, Set<Integer>> values = new HashMap<>();

        for (int i = 0; i < trust.length; i++) {
            int finalI = i;
            values.compute(trust[i][0], (k, v) -> {
                if (v == null) {
                    return new HashSet<>(Collections.singletonList(trust[finalI][1]));
                } else {
                    v.add(trust[finalI][1]);
                    return v;
                }
            });
        }

        int judje = -1;
        for (int i = 1; i <= N; i++) {
            if (values.get(i) == null) {
                judje = i;
            }
        }
        if (judje == -1) return judje;

        for (Map.Entry<Integer, Set<Integer>> entry : values.entrySet()) {
            if(!entry.getValue().contains(judje)) return -1;
        }
        return judje;
    }
}

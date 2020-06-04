package contest.june;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    public static void main(String[] args) {
//        System.out.println(new TwoCityScheduling().twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
        System.out.println(new TwoCityScheduling().twoCitySchedCost(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}));
    }


    public int twoCitySchedCost(int[][] costs) {
        int result = 0;
        Arrays.sort(costs, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });
        int first = costs.length / 2;
        int second = costs.length / 2;
        for (int i = costs.length - 1; i >= 0; i--) {
            if (first == 0) {
                result += costs[i][1];
                second--;
                continue;
            }
            if (second == 0) {
                result += costs[i][0];
                first--;
                continue;
            }
            int i1 = costs[i][0];
            int i2 = costs[i][1];
            if (i1 > i2) {
                 result += i2;
                second--;
            } else {
                result += i1;
                first--;
            }
        }
        return result;
    }
}

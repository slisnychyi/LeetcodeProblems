package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CellsWithOddValues {


    public static void main(String[] args) {

        System.out.println(new CellsWithOddValues().repeatedNTimes(new int[]{1, 2, 3, 3}));

    }


    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i : A){
            m.compute(i, (key, value) -> value == null ? 1 : value + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries  = m.entrySet();

        for(Map.Entry<Integer, Integer> entry : entries){
            if(entry.getValue() == A.length / 2) return entry.getKey();
        }

        return -1;
    }

    public int oddCells(int n, int m, int[][] indices) {

        int[][] grid = new int[n][m];

        for (int[] index : indices) {
            int row = index[0];
            int column = index[1];
            int[] ints = grid[row];
            for (int i1 = 0; i1 < ints.length; i1++) {
                ints[i1]++;
            }
            for (int i1 = 0; i1 < grid.length; i1++) {
                grid[i1][column]++;
            }
        }

        int res = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) res++;
            }
        }
        return res;

    }


}

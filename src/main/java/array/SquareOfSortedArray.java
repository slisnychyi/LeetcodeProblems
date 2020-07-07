package array;

import java.util.Arrays;

public class SquareOfSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquareOfSortedArray().sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        while(end - start >= 0){
            int startVal = (int) Math.pow(A[start], 2);
            int endVal = (int) Math.pow(A[end], 2);
            if(startVal > endVal){
                res[end - start] = startVal;
                start++;
            } else {
                res[end - start] = endVal;
                end--;
            }
        }
        return res;
    }
}

package array;

public class CountNegativeNumbers {

    public static void main(String[] args) {
        System.out.println(new CountNegativeNumbers().countNegatives(new int[][]{
//                {4, 3, 2, -1},
//                {3,2,1,-1},
//                {1,1,-1,-2},
//                {-1,-1,-2,-3}
//                {3,2}
                {1,0}
        }));
    }

    public int countNegatives(int[][] grid) {
        int res = 0;
        for(int[] arr : grid){
            res += findNegative(arr);
        }
        return res;
    }

    int findNegative(int[] arr){
        int start = -1;
        int end = arr.length;
        while(end - start > 1){
            int mid = (end + start)/2;
            if(arr[mid] >= 0){
                start = mid;
            } else {
                end = mid;
            }
        }
        if(end != arr.length) return arr.length - end;
        return 0;

    }
}

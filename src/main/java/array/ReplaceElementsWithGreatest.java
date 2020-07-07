package array;

import java.util.Arrays;

public class ReplaceElementsWithGreatest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReplaceElementsWithGreatest().replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    public int[] replaceElements(int[] arr) {
        int max = getMax(0, arr);
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) break;
            if(arr[i] != max) {
                arr[i] = max;
            } else {
                max = getMax(i + 1, arr);
                arr[i] = max;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    int getMax(int start, int[] arr){
        int max = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

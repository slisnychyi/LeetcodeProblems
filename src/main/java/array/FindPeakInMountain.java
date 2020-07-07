package array;

public class FindPeakInMountain {

    public static void main(String[] args) {
        System.out.println(new FindPeakInMountain().peakIndexInMountainArray(new int[]{3, 4, 5, 1}));
    }

    public int peakIndexInMountainArray(int[] A) {
        int result = -1;
        int start = -1;
        int end = A.length;
        while(end - start > 1){
            int mid = (end + start) / 2;
            if(A[mid - 1] >  A[mid]) {
                end = mid;
                continue;
            }
            if(A[mid + 1] >  A[mid]) {
                start = mid;
                continue;
            }
            result = mid;
            break;
        }
        return result;
    }
}

package contest.june;

public class SearchInsertPosition {


    public static void main(String[] args) {

        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3}, 2));

    }

    public int searchInsert(int[] nums, int target) {
        int start = -1;
        int finish = nums.length;
        int mid = 0;
        while (finish - start > 1) {
            mid = (finish + start) / 2;
            if (nums[mid] > target) finish = mid;
            if (nums[mid] < target) start = mid;
            if (nums[mid] == target) return mid;
        }
        return nums[mid] > target ? mid : mid + 1;
    }

}

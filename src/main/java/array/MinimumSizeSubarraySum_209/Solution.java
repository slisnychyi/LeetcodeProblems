package array.MinimumSizeSubarraySum_209;

/*
    Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

    Example:

    Input: s = 7, nums = [2,3,1,2,4,3]
    Output: 2
    Explanation: the subarray [4,3] has the minimal length under the problem constraint.
    Follow up:
    If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
 */

public class Solution {

    public int minSubArrayLen2(int s, int[] nums) {
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int len = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                len++;
                if (sum >= s && length > len) {
                    length = len;
                    break;
                }
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }

    //decision with 0(log(n))
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int length = Integer.MAX_VALUE;
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        for (int i = 1; i <= nums.length; i++) {
            int find = s + sums[i - 1];

        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }

}

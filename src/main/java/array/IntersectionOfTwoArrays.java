package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntToLongFunction;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 * <p>
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }



    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> collect = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        for (int val : nums2) {
            if (collect.contains(val)) {
                res.add(val);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer re : res) {
            result[i++] = re;
        }
        return result;
    }

}

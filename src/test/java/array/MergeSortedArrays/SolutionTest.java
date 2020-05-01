package array.MergeSortedArrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1(){
        //given
        Solution solution = new Solution();
        //when
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{4,5,6}, 3);
        //then
        assertThat(nums1).containsExactly(1,2,3,4,5,6);
    }

    @Test
    public void test2(){
        //given
        Solution solution = new Solution();
        //when
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 3, nums2, 3);
        //then
        assertThat(nums1).containsExactly(1,2,3,4,5,6);
    }

    @Test
    public void test3(){
        //given
        Solution solution = new Solution();
        //when
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        //then
        assertThat(nums1).containsExactly(1);
    }
}
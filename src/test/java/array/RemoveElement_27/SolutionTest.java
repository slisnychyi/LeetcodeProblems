package array.RemoveElement_27;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        //given
        Solution solution = new Solution();
        //when
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        solution.removeElement(nums, val);
        //then
        assertThat(nums).startsWith(2, 2);
    }

    @Test
    public void test2() {
        //given
        Solution solution = new Solution();
        //when
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        solution.removeElement(nums, val);
        //then
        assertThat(nums).startsWith(0, 1, 3, 0, 4);
    }

    @Test
    public void test3() {
        //given
        Solution solution = new Solution();
        //when
        int[] nums = {2};
        int val = 3;
        solution.removeElement(nums, val);
        //then
        assertThat(nums).startsWith(2);
    }

}
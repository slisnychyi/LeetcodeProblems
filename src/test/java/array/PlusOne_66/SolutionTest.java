package array.PlusOne_66;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{1, 2, 3});
        //then
        assertThat(result).containsExactly(1,2,4);
    }

    @Test
    public void test2() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{1, 2, 9});
        //then
        assertThat(result).containsExactly(1,3,0);
    }

    @Test
    public void test3() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{1, 9, 9});
        //then
        assertThat(result).containsExactly(2,0,0);
    }

    @Test
    public void test4() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{0});
        //then
        assertThat(result).containsExactly(1);
    }

    @Test
    public void test5() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{9});
        //then
        assertThat(result).containsExactly(1, 0);
    }


    @Test
    public void test6() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{9, 9});
        //then
        assertThat(result).containsExactly(1, 0, 0);
    }

    @Test
    public void test7() {
        //given
        Solution solution = new Solution();
        //when
        int[] result = solution.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        //then
        assertThat(result).containsExactly(9,8,7,6,5,4,3,2,1,1);
    }

}
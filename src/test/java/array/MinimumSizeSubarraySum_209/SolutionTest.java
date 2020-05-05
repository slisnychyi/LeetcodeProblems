package array.MinimumSizeSubarraySum_209;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test1(){
        //given
        Solution solution = new Solution();
        //when
        int[] values = {1, 2, 2, 3, 4, 9};
        int result = solution.minSubArrayLen(8, values);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test2(){
        //given
        Solution solution = new Solution();
        //when
        int[] values = {2,3,1,2,4,3};
        int result = solution.minSubArrayLen(7, values);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test3(){
        //given
        Solution solution = new Solution();
        //when
        int[] values = {2,3,2,2,4,3};
        int result = solution.minSubArrayLen(1, values);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test4(){
        //given
        Solution solution = new Solution();
        //when
        int[] values = {2,3,2,2,4,3};
        int result = solution.minSubArrayLen(100, values);
        //then
        assertThat(result).isEqualTo(0);
    }

}
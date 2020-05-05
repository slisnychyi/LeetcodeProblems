package array.Sum_closest_16;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test1() {
        //given
        Solution solution = new Solution();
        //when
        int[] values = {-1, 2, 1, -4};
        int target = 1;
        int result = solution.threeSumClosest(values, target);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        //given
        Solution solution = new Solution();
        //when
        int[] values = {1, 1, 1, 0};
        int target = 100;
        int result = solution.threeSumClosest(values, target);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        //given
        Solution solution = new Solution();
        //when
        int[] values = {1,1,-1,-1,3};
        int target = -1;
        int result = solution.threeSumClosest(values, target);
        //then
        assertThat(result).isEqualTo(-1);
    }

}
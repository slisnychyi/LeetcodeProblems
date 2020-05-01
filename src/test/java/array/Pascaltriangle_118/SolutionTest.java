package array.Pascaltriangle_118;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test1() {
        //given
        Solution solution = new Solution();
        //when
        List<List<Integer>> generate = solution.generate(6);
        //then
        assertThat(generate).isEqualTo(
                Arrays.asList(
                        Collections.singletonList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1),
                        Arrays.asList(1, 4, 6, 4, 1), Arrays.asList(1, 5, 10, 10, 5, 1)
                )
        );
        System.out.println(generate);
    }

}
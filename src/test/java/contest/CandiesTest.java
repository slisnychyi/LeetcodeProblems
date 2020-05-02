package contest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class CandiesTest {
    @Test
    public void test1(){
        //given
        Candies can = new Candies();
        //when
        List<Boolean> res = can.kidsWithCandies(new int[]{4,2,1,1,2}, 1);
        //then
        assertThat(res).isEqualTo(Arrays.asList(true, false, false, false, false));
    }

    @Test
    public void test2(){
        //given
        Candies can = new Candies();
        //when
        List<Boolean> res = can.kidsWithCandies(new int[]{12,1,12}, 10);
        //then
        assertThat(res).isEqualTo(Arrays.asList(true, false, true));
    }

}
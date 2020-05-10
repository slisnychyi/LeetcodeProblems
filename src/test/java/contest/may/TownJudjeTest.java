package contest.may;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class TownJudjeTest {

    @Test
    public void test1() {
        //given
        TownJudje townJudje = new TownJudje();
        //when
        int result = townJudje.findJudge(2, new int[][]{{1, 2}});
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        //given
        TownJudje townJudje = new TownJudje();
        //when
        int result = townJudje.findJudge(3, new int[][]{{1, 3}, {2, 3}});
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        //given
        TownJudje townJudje = new TownJudje();
        //when
        int result = townJudje.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        //given
        TownJudje townJudje = new TownJudje();
        //when
        int result = townJudje.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}});
        //then
        assertThat(result).isEqualTo(3);
    }

}
package interview.mock;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class FloodRoadTest {

    @Test
    public void test1(){
        //given
        FloodRoad floodRoad = new FloodRoad();
        //when
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(3)).isEqualTo(3);
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(0)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(1)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(2)).isEqualTo(2);
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(5)).isEqualTo(8);
        assertThat(floodRoad.getNumberOfWaysForTwoJumps(4)).isEqualTo(5);
    }

    @Test
    public void test2(){
        //given
        FloodRoad floodRoad = new FloodRoad();
        //when
        assertThat(floodRoad.getNumberOfWaysForThreeJumps(3)).isEqualTo(4);
        assertThat(floodRoad.getNumberOfWaysForThreeJumps(0)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForThreeJumps(1)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForThreeJumps(2)).isEqualTo(2);
    }

    @Test
    public void test3(){
        //given
        FloodRoad floodRoad = new FloodRoad();
        //when
        assertThat(floodRoad.getNumberOfWaysForNJumps(3, 3)).isEqualTo(4);
        assertThat(floodRoad.getNumberOfWaysForNJumps(0, 3)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForNJumps(1, 3)).isEqualTo(1);
        assertThat(floodRoad.getNumberOfWaysForNJumps(2, 3)).isEqualTo(2);
    }

    // 1 2 3

    // 1 - 1 -1
    // 1 - 2
    // 2- 1
    // 3

}
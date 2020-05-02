package contest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class MaxDifTest {

    @Test
    public void test1(){
        //given
        MaxDif maxDif = new MaxDif();
        //when
        List<Integer> result = Stream.of(123456)
                .map(maxDif::maxDiff)
                .collect(Collectors.toList());
        //then
        assertThat(result).isEqualTo(Arrays.asList(820000));
    }

}
package contest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class CheckLength_5401Test {

    @Test
    public void test1(){
        //given
        CheckLength_5401 service = new CheckLength_5401();
        //when
        boolean result = service.kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2);
        //then
        assertThat(result).isTrue();
    }

    @Test
    public void test2(){
        //given
        CheckLength_5401 service = new CheckLength_5401();
        //when
        boolean result = service.kLengthApart(new int[]{1,0,0,1,0,1}, 2);
        //then
        assertThat(result).isFalse();
    }

    @Test
    public void test3(){
        //given
        CheckLength_5401 service = new CheckLength_5401();
        //when
        boolean result = service.kLengthApart(new int[]{1,1,1,1,1}, 0);
        //then
        assertThat(result).isTrue();
    }

    @Test
    public void test4(){
        //given
        CheckLength_5401 service = new CheckLength_5401();
        //when
        boolean result = service.kLengthApart(new int[]{0,1,0,1}, 1);
        //then
        assertThat(result).isTrue();
    }

    @Test
    public void test5(){
        //given
        CheckLength_5401 service = new CheckLength_5401();
        //when
        boolean result = service.kLengthApart(new int[]{0,1,1,0,1}, 4);
        //then
        assertThat(result).isFalse();
    }

}
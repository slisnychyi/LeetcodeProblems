package contest.may;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class RansomNoteTest {

    @Test
    public void test1(){
        //given
        RansomNote ransomNote = new RansomNote();
        //when
        boolean result = ransomNote.canConstruct("aa", "aab");
        //then
        assertThat(result).isTrue();
    }

}
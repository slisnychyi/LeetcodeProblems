package contest.may;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class CousinTreeTest {

    @Test
    public void test1(){
        //given
        CousinTree service = new CousinTree();
        //when
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        boolean cousins = service.isCousins(root, 4, 3);
        //then
        assertThat(cousins).isFalse();
    }

    @Test
    public void test2(){
        //given
        CousinTree service = new CousinTree();
        //when
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)));
        boolean cousins = service.isCousins(root, 5, 4);
        //then
        assertThat(cousins).isTrue();
    }

    @Test
    public void test3(){
        //given
        CousinTree service = new CousinTree();
        //when
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        boolean cousins = service.isCousins(root, 2, 3);
        //then
        assertThat(cousins).isFalse();
    }

}
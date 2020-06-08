package array.CreateTargetInt_1389;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().createTargetArray2(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            int value = nums[i];
            int indx = index[i];
            result.add(indx, value);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] createTargetArray2(int[] nums, int[] index) {
        Node n = new Node(nums[index[0]], null);
        for(int i = 1; i < index.length; i++){
            if(index[i] == 0){
                n = new Node(nums[i], n);
            } else {
                Node cur = n;
                int j = 0;
                while(j < index[i] - 1){
                    cur = cur.next;
                    j++;
                }
                cur.next = new Node(nums[i], cur.next);
            }
        }
        int[] res = new int[nums.length];
        int i = 0;
        while(n != null){
            res[i++] = n.val;
            n = n.next;
        }
        return res;
    }

    static class Node{
        int val;
        Node next;
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}



package array.SelfDividingNumbers_728;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(66, 708));

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        while (left <= right) {
            int tmp = left;
            boolean add = true;
            while (tmp != 0) {
                if (tmp % 10 == 0 || left % (tmp % 10) != 0) {
                    add = false;
                    break;
                } else {
                    tmp /= 10;
                }
            }
            System.out.println(left);
            if (add) res.add(left);
            left++;
        }
        return res;
    }
}

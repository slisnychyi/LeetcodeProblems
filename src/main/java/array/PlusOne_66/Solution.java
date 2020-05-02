package array.PlusOne_66;

import java.util.Stack;
import java.util.function.IntFunction;

public class Solution {

    public int[] plusOne2(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        boolean addOne = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && addOne) {
                stack.push(0);
            } else if (addOne) {
                stack.push(digits[i] + 1);
                addOne = false;
            } else {
                stack.push(digits[i]);
            }
        }
        int[] result = new int[addOne ? stack.size() + 1 : stack.size()];
        if (addOne) result[0] = 1;
        int i = addOne ? 1 : 0;
        for (; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    /*
    int i = digits.length-1;
        while(i>=0) {
            if(digits[i]==9) {
                digits[i]=0;
                i--;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;

     */
}

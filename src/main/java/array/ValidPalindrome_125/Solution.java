package array.ValidPalindrome_125;

public class Solution {

    public boolean isPalindrome(String s) {
        return check(s.toCharArray(), 0, s.length() - 1);
    }

    public boolean check(char[] arr, int start, int finish) {
        if (start <= finish) {
            if (!Character.isLetter(arr[start]) && !Character.isDigit(arr[start])) return check(arr, start + 1, finish);
            if (!Character.isLetter(arr[finish])&& !Character.isDigit(arr[finish])) return check(arr, start, finish - 1);
            if (Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[finish])) return false;
            return check(arr, start + 1, finish - 1);
        }
        return true;
    }
}

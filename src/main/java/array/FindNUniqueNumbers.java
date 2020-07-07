package array;

public class FindNUniqueNumbers {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int value = 1;
        for (int i = n % 2 == 0 ? 0 : 1; i < n; i += 2) {
            res[i] = value;
            res[i + 1] = value * -1;
            value++;
        }
        return res;
    }
}

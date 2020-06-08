package dynamic;

public class Fibonaci {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " = " + fib(i));
        }
    }

    public static long fib(int value) {
        if (value <= 1) return 1;
        long i = 1;
        long j = 1;
        for (int k = 1; k < value; k++) {
            j = i + j;
            i = j - i;
        }
        return j;
    }

}

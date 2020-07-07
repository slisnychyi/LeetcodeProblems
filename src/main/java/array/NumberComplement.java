package array;

public class NumberComplement {

    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(1));

        System.out.println(5 | 1);
        System.out.println(2 | 1);
        System.out.println(1 | 1);


    }

    public int findComplement(int num) {
        int tmp = num;
        int val = 0;
        int n = 0;
        while (num != 0) {
            val += Math.pow(2, n++);
            num >>= 1;
        }
        return tmp ^ val;
    }
}

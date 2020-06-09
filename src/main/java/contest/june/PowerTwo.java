package contest.june;

public class PowerTwo {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " = " + (int) Math.pow(2, i));
        }
    }


    public boolean isPowerOfTwo(int n) {
        int curr = 0;
        for (int j = 0; j < 30; j++) {
            if(curr == (int) Math.pow(2, j)) return true;
        }
        return false;
    }
}

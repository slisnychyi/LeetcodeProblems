package contest.may;

public class NumberComplement {

    public int findComplement(int num) {
        for (int i = 0; i < 32; i++) {
            int pow = (int) Math.pow(2, i);
            if(pow == Integer.MAX_VALUE){
                return num ^ pow;
            }
            if (pow - 1 == num) return 0;
            if (pow > num) {
                return num ^ (pow - 1);
            }
        }
        return 0;
    }
}

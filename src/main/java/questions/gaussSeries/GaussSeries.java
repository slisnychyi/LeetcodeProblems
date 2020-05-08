package questions.gaussSeries;

public class GaussSeries {

    public long getSum(long x, long y){
        return ((x + y) * ((y - x) + 1)) / 2;
    }

    public long getSum(int a1, int a2, int n){
        int d = a2 - a1;
        int an = a1 + ((n - 1) * d);
        return ((a1 + an) * n) / 2;
    }

    public static void main(String[] args) {
//        long sum = new GaussSeries().getSum(2, 5);
//        System.out.println(sum);

        long sum = new GaussSeries().getSum(1, 100, 10000);
        System.out.println(sum);

    }



}

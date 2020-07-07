package contest;

public class TheKthFactor {

    public static void main(String[] args) {
        System.out.println(new TheKthFactor().kthFactor(1000,3));
        System.out.println(1/2);
    }

    public int kthFactor(int n, int k) {
        if(k == 1) return 1;
        if(k > n) return -1;
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
            if(count == k) return i;
        }
        return -1;
    }
}

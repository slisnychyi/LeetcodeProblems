package array;

public class XorInArray {

    public static void main(String[] args) {
        System.out.println(new XorInArray().xorOperation(5, 0));
    }

    public int xorOperation(int n, int start) {
        int cur = start;
        int result = 0;
        for(int i = start; i < start + n - 1; i++){
            int next = cur + 2;
            result = result ^ next;
            cur = next;
        }
        return result;
    }
}

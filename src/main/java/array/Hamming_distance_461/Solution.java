package array.Hamming_distance_461;

public class Solution {

    public static void main(String[] args) {
        assert new Solution().hammingDistance(1, 8) == 2;
    }

    public int hammingDistance(int x, int y) {
        int value = x ^ y;
        int count = 0;
        while (value != 0){
            count += value & 1;
            value >>= 1;
        }
        return count;
    }
}

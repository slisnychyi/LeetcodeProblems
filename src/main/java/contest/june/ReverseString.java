package contest.june;

public class ReverseString {

    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        char[] chars2 = "hellos".toCharArray();
        new ReverseString().reverseString(chars);
        new ReverseString().reverseString(chars2);
        System.out.println(chars);
        System.out.println(chars2);
    }

    public void reverseString(char[] s) {
        for(int i=0, j=s.length-1; i < s.length / 2; i++, j--){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}

package problems;

public class MagicNumberOfFive {

    public static void main(String[] args) {
        int n = 6;             // nth magic no
        int ans = 0;
        int base = 5;
        while( n>0 ){
            int last = n & 1;       // gives last digit
            n = n >> 1;             // right shift by 1 to get rid of last element
            ans += base * last;
            base *= 5;
        }
        System.out.println(n+"th magic number is: "+ ans);
    }
}

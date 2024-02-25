package problems;

public class Gcd {

    public static void main(String[] args) {
        System.out.println("GCD of 4 and 8 is "+ findGcd(4,8));
    }

    public static int findGcd(int a, int b){
        if( a == 0 ){
            return b;
        }
        return findGcd(b%a, a);
    }
}

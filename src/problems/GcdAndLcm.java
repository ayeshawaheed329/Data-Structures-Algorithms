package problems;

public class GcdAndLcm {
    public static void main(String[] args) {
        System.out.println("GCD of 4 and 8 : "+ findGcd(4,8));
        System.out.println("LCM of 3 and 7 : "+findLcm(3,7));
    }
    public static int findGcd(int a, int b){
        if( a == 0 ){
            return b;
        }
        return findGcd(b%a, a);
    }
    public static int findLcm(int a, int b){

        return ( a * b / findGcd(a,b));
    }
}

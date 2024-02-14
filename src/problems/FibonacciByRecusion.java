package problems;
import java.util.Scanner;

public class FibonacciByRecusion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fibonachi number you want to know: ");
        int n = input.nextInt();
        System.out.println("The number is: "+fibonachi(n));
    }
    static  int fibonachi(int n){
        if( n==0 || n==1 ){
            return n;
        }else{
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
}

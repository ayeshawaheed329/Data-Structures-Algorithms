package problems;

import java.util.Scanner;

public class SqrtByBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        System.out.println("Sqrt of number is : "+sqrt(n,p));
    }
    static double sqrt(int n, int p){
        int start = 1;
        int end = n;
        while( start <= end ){
            int middle = start + ( end - start )/2 ;
            int sqr = middle * middle;
            if( sqr == n ){
                return middle;
            }
            if( sqr <= n ){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        double root = 0.0;
        double increment = 0.1;
        for(int i=1; i<=p; i++){
            while (root*root <= n){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}

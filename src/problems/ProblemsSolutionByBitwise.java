package problems;

public class ProblemsSolutionByBitwise {
    public static void main(String[] args) {
        System.out.println("2 is: "+isEven(2) + ". 3 is :"+isEven(3));
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println("Unique element in an array is "+ unique(arr));
        System.out.println("3rd bit of 5" + getithBit(5, 3));

        System.out.println("16 is power of 2? "+isPowerOfTwo(16));
        System.out.println("10 is power of 2? "+isPowerOfTwo(10));

        System.out.println("The number of set bits in " + Integer.toBinaryString(131) +" are : "+countSetBits(131));
    }

    public static  boolean isPowerOfTwo(int n){
        /* find if number is power 2 or not
            Tip: In power of 2 binary always have only one 1.
            i - 2 - 10
            ii - 4 100
            iii - 8 1000
         */
        return (n & n-1) == 0;
    }
    public static String isEven(int n){
        if((n & 1) != 1){
            return "Even";
        }else{
            return "Odd";
        }
    }
    public static int unique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return  unique;
    }

    public static int getithBit(int n, int i){
        int mask = ( 1 << (i-1));
        return n & mask;
    }

    public static  int countSetBits(int n){
        /*
            if no is AND with it's negative it return RMB (n & -n)
            subtract the number from it
            count RMBS
         */
        int count = 0;
        while( n > 0 ){
            count++;
            n -= ( n & -n);
        }
        return count;
    }
}

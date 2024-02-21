package problems;

public class ProblemsSolutionByBitwise {
    public static void main(String[] args) {
        System.out.println("2 is: "+isEven(2) + ". 3 is :"+isEven(3));
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println("Unique element in an array is "+ unique(arr));
        System.out.println("3rd bit of 5" + getithBit(5, 3));
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
        };
        return  unique;
    }

    public static int getithBit(int n, int i){
        int mask = ( 1 << (i-1));
        return n & mask;
    }
}

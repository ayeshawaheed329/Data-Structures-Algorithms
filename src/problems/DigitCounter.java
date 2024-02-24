package problems;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int number = input.nextInt();
        int digits = ( int ) ( Math.log(number)/ Math.log(base) ) + 1;
        System.out.println("No of digits in "+number+" are: "+digits);
    }
}

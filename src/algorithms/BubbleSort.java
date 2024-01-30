package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,7,1,9,34,76,23};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){

        boolean swapped;
        for(int i=0; i< arr.length; i++){
            swapped = false;
            for(int j=1; j< arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if not swapped for 1 entire pas
            if(!swapped){
                break;
            }
        }
    }
}

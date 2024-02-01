package algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,7,1,9,34,76,23};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){

        for(int i=0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = last;
            for(int j=0; j< last; j++){
                if(arr[j]> arr[max]){
                    max = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }
}

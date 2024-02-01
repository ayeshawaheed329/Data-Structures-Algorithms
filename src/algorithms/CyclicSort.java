package algorithms;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while( i< arr.length){
            if( arr[i] != i + 1 ){
                int current_value = arr[i];
                int swap_with = arr[current_value - 1];
                arr[current_value - 1] = current_value;
                arr[i] = swap_with;
            }else{
                i++;
            }
        }
    }
}

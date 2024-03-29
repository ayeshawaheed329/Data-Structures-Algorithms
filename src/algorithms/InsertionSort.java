package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,7,1,9,34,76,23};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}

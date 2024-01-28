package problems;

import java.util.Arrays;

public class PivotInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,14,17};
        int[] rotate_arr2 = rotateArray(arr, 2);
        int[] rotate_arr4 = rotateArray(arr, 4);
        int[] rotate_arr7 = rotateArray(arr, 7);
        System.out.println(Arrays.toString(rotate_arr2) + " Laargest is: "+ findPivot(rotate_arr2));
        System.out.println(Arrays.toString(rotate_arr4) + " Laargest is: "+ findPivot(rotate_arr4));
        System.out.println(Arrays.toString(rotate_arr7) + " Laargest is: "+ findPivot(rotate_arr7));
    }

    static int[] rotateArray(int[] arr, int k){
        int size = arr.length;
        int[] newArr = new int[size];
        for(int i=0; i<size; i++){
            int index = (i+k)%size;
            newArr[index] = arr[i];
        };
        return newArr;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while( start <= end ){
            int middle = start + ( end - start) / 2;
            if( middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if( middle > start && arr[middle] < arr[middle - 1] ){
                return middle - 1;
            }
            if( arr[middle] >= arr[start]){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        };
        return  - 1;
    }
}

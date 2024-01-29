package problems;

import java.util.Arrays;

public class PivotInDuplicatedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {2,3,3,5,5,5,5,6,8,9,9,9,14,17,17};
        int[] rotate_arr2 = rotateArray(arr, 2);
        int[] rotate_arr7 = rotateArray(arr, 7);
        int[] rotate_arr14 = rotateArray(arr, 14);
        System.out.println(Arrays.toString(rotate_arr2) + " Largest is: "+ findPivot(rotate_arr2));
        System.out.println(Arrays.toString(rotate_arr7) + " Largest is: "+ findPivot(rotate_arr7));
        System.out.println(Arrays.toString(rotate_arr14) + " Largest is: "+ findPivot(rotate_arr14));
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
            // skip duplicates
            if( arr[middle] == arr[start] && arr[middle] == arr[end]){
                if( arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if( arr[end] < arr[end -1]){
                    return  end - 1;
                }
                end--;
            }else if( arr[middle] > arr[start] || ( arr[middle] == arr[start] && arr[middle] > arr[end])){
                start = middle + 1;
            }else{
                end = middle - 1;
            }

        };
        return  - 1;
    }
}

package algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,12,18,20};
        System.out.println("Searching 9: "+ search(arr, 9));
        int[] arr2 = {80, 34, 23, 20, 10, 5, 3, 2, 1};
        System.out.println("Searching 2: "+search(arr2, 2));
        System.out.println("Searching -3 "+ search(arr2, -3));
    }

    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[0] < arr[end];
        while(start <= end){
            int middle = start + (end - start)/2;
            if( arr[middle] == target ){
                return middle;
            }
            if(asc){
                if( arr[middle] < target){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }else{
                if( arr[middle] > target){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }
        };
        return -1;
    }
}


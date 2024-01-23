package problems;

// Find floor of given number from any array

public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9, 11};
        System.out.println("Floor of 3 : "+ search(arr, 3));
        System.out.println("Floor of 8 : "+  search(arr, 8));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while( start <= end ){
            int middle = start + ( end - start)/2 ;
            if( arr[middle] == target){
                return target;
            }
            if(arr[middle] < target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return arr[end];
    }
}

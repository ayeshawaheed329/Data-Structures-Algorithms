package algorithms;

public class InfiniteSortedArray {


    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int[]  arr = {1,3,4,5,6,9,11,23,25,37,45,67,89,233,444,666};           // Assuming array of an infinite length, can't use arr.length
        int target = 233;                      // target to search
        while( arr[end] < target){
            int temp = end + 1;
            end = end + ( end - start + 1) * 2;
            start = temp;
        };
        System.out.println("Position for "+target+" is: "+ search(arr, target, start, end));

    }
    static int search(int[] arr, int target, int start, int end ){

        while( start <= end){
            int middle = start + (end - start)/2;
            if( arr[middle] == target){
                return middle;
            }
            if( arr[middle] < target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }

        }
        return -1;
    }
}

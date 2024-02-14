package algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,12,18,20};
        System.out.println("Searching 9: "+ search(arr, 9));
        System.out.println("Searching 2 recursively: "+binarySearchByRecursion(arr,2,0, arr.length - 1));
        int[] arr2 = {80, 34, 23, 20, 10, 5, 3, 2, 1};
        System.out.println("Searching 2: "+search(arr2, 2));
        System.out.println("Searching -3 recursively: "+ binarySearchByRecursion(arr2, -3, 0, arr2.length-1));

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

    static int binarySearchByRecursion(int[] arr, int target, int start, int end){
        if( start <= end ){
            int middle = start + (end - start)/2;
            if( arr[middle] == target ){
                return middle;
            }
            boolean asc = arr[start] < arr[end];
            if(asc){
                if( arr[middle] < target){
                    return binarySearchByRecursion(arr, target, middle+1, end);
                }else{
                    return binarySearchByRecursion(arr, target, start, middle - 1);
                }
            }else{
                if( arr[middle] > target){
                    return binarySearchByRecursion(arr, target, middle+1, end);
                }else{
                    return binarySearchByRecursion(arr, target, start, middle - 1);
                }
            }
        }
        return -1;

    }
}


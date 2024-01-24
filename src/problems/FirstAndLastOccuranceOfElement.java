package problems;

public class FirstAndLastOccuranceOfElement {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 8, 8, 9,9, 9 };
        System.out.println("First Occurance of 9 : "+ search(arr, 9, true));
        System.out.println("Last  Occurance of 9 : "+ search(arr, 9, false));

    }

    static int search(int[] arr, int target, boolean firstIndex){
        int start =0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int middle = start + ( end - start)/2;
            if( arr[middle] < target){
                start = middle + 1;
            }else if( arr[middle] > target){
                end = end - 1;
            }else{
                ans = middle;
                if( firstIndex ){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }
        return ans;

    }
}

package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSortForMissingNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> result = new ArrayList<>();

        sort(nums);
        System.out.println("Sorted numbers: "+Arrays.toString(nums));
        for(int i=0; i<nums.length; i++){
            if( nums[i] != i+1 && i < nums.length){
                result.add(i+1);
            }
        }
        System.out.println("Missing numbers: "+result);
    }
    public static void sort(int[] nums){
        int i = 0;
        while( i < nums.length ){
            int n = nums[i];
            int correct = nums[n-1];
            if( n != i+1 && n-1 < nums.length && n != correct ){
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
    }
}

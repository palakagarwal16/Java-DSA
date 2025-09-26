package Sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
       int nums [] = { 4 , 6 , 5 , 2, 3 , 1};
       Cycle(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Cycle( int [] nums){
        int i = 0;
        while( i<nums.length){
            int correct = nums[i]-1;
            if( nums[i]!= nums[correct] ){
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }
    }

    public static void swap( int[] nums , int first , int second ){
        int temp = nums[first];
        nums[first ] = nums[second];
        nums[second] = temp;
    }
}

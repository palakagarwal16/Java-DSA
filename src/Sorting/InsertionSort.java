package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
    int [] nums = { 43 , 56, 1 ,4 ,53 ,56};
    Insertion(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void Insertion( int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j> 0; j--) {
                if( nums[j-1]>nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
    }


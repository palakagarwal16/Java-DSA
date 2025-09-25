package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int nums[]= { 1, 2 , 44 , 5 ,2};
      bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubbleSort( int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if( arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }

    }
}

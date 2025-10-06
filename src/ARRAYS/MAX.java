package ARRAYS;

public class MAX {
    // this is an optimal solution to find max number
    public static void main(String[] args) {
        int maximum = 0;
        int arr[] = { 454, 564 ,223 ,456 , 45, -24};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
            System.out.println( "Maximum is " + maximum);
        }
    }


//Time Complexity: O(n)
//You scan the array once, comparing each element.
//
//n = number of elements in the array.
//
//This is the best possible time you can get — you must look at every element once to be sure it's the largest.
//
//Space Complexity: O(1)
//You're only using one variable (max) to store the result.
//
//No extra space based on input size.


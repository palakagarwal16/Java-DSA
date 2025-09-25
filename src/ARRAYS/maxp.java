package ARRAYS;

public class maxp {
    int[]MinMax(int[] arr){
        int min = arr[0] , max= arr[0] ;
        for (int i = 0; i < arr.length; i++) {
        if ( i < arr[min]) min = i ;
        if (i > arr[max]) max = i ;
        }
        return new int[] { min , max} ;
    }
}

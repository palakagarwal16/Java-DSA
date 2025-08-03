package ARRAYS;

public class Secondmax {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int arr[] = { 454, 564 ,223 ,456 , 45, -24};
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maximum) {
            secmax = maximum ;
            maximum = arr[i];
        }
        if ( arr[i] != maximum && arr[i] >secmax){
            secmax = arr[i];
            System.out.println( secmax );
        }
    }
}
}

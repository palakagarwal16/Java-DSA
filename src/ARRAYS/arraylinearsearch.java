package ARRAYS;

public class arraylinearsearch {
    public static void main(String[] args) {
        System.out.println( "Linear Search of 234 ");
    int arr [] = {2 , 4 ,56 ,7 , 56 , 34 , 77 , 234 , 56 } ;
    boolean flag = false ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 234 ){
                System.out.println( "Element found on index " + i );
                flag = true;
                break;
            } }
            if(flag == false){
                System.out.println( "Not found ");
            }

    }
}

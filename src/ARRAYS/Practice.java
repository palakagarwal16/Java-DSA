package ARRAYS;

public class Practice {
    static int[] myarray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= i + 1;
        }
        return arr ;
    }

    public static void main(String[] args) {
        int [] myarr = myarray(5);
            for (int x : myarr) {
                System.out.print(x +" ");  // 1 2 3 4 5
            }
    }
}

//    public static void main(String[] args) {
//      int ans =   square(6);
//        System.out.println(ans);
//    }


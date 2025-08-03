package ARRAYS;

public class rotatebyk {
    public static void reverse(int num[], int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;

        }
    }

    public static void rotate(int[] num, int k) {
        k = k % num.length;
        reverse(num, 0, num.length - 1);
        reverse(num, k, num.length - 1);
        reverse(num, 0, k - 1);
    }


    public static void main(String[] args) {
        int[] num = {23, 45, 332, 322, 3432, 223, 35};
        int k = 3; // how many positions to rotate
        rotate(num, k);

        // print result
        for (int i : num) {
            System.out.print(i + " ");
        }

    }
}


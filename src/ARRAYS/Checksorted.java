package ARRAYS;

public class Checksorted {
    public static void main(String[] args) {
        int nums[] = { 1 , 12 , 34 ,45 } ;
        System.out.println(check(nums));
    }

    public static boolean check(int nums[]) {
        for (int i = 0; i <nums.length -1; i++) {
            if (nums[i] > nums[i + 1 ])
                return false;
        }

    return true;
}
}




package ARRAYS;

public class Removeduplicates {
    public static int duplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
    public static void main (String[]args){
           int[] nums  ={12, 23, 23, 34, 34, 45, 46} ;
           int length = duplicates(nums);
            System.out.println("duplicates length " + length );
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

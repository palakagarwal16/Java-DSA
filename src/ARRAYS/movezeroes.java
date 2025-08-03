package ARRAYS;

public class movezeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int lastindexzero = 0 ;
            for( int i = 0 ; i<nums.length ; i++){
                if (nums[i]!=0 ){
                    int temp = nums[i];
                    nums[i]= nums[lastindexzero];
                    nums[lastindexzero] = temp;
                    lastindexzero++;
                }

            }
        }
    }
}

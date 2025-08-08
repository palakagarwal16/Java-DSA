package ARRAYS;

public class sorting012 {
        public void sortColors(int[] nums) {
            int cout = 0;
            int cout1 = 0;
            int cout2 =  0;
            for( int i= 0; i<nums.length ; i++){
                if(nums[i]==0){
                    cout++;
                }
                else if (nums[i]==1){
                    cout1++;
                }
                else {
                    cout2++;}
            }
            for(int i= 0; i <cout ; i++){
                nums[i] = 0;
            }
            for(int i= cout; i <cout+cout1 ; i++){
                nums[i] = 1;
            } for(int i= cout1+cout; i <nums.length ; i++){
                nums[i] = 2;
            }
        }
    }


package ARRAYS;

class consectiveone {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        int count = 0 ;
        for (int i =0 ; i < nums.length ; i++){
            if(nums[i]== 1){
                count++;
                max = Math.max(max , count);
            }
            else {
                count =0 ;
            }

        }
        return max;

    }
}




//    nums[0] = 1 → count = 1, max = Math.max(0, 1) = 1
//
//    nums[1] = 1 → count = 2, max = Math.max(1, 2) = 2
//
//    nums[2] = 0 → count = 0 (reset on 0)
//
//    nums[3] = 1 → count = 1, max = Math.max(2, 1) = 2
//
//    nums[4] = 1 → count = 2, max = Math.max(2, 2) = 2
//
//    nums[5] = 1 → count = 3, max = Math.max(2, 3) = 3


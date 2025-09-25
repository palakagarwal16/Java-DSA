package ARRAYS;
import java.util.HashSet;
import java.util.Set;

public class longsubsequence {

        public int longestConsecutive(int[] nums) {
            if (nums.length ==0 || nums==null) {
                return 0 ;
            }
            Set<Integer> set = new HashSet<>();
            for( int num : nums )
            {
                set.add(num);
            }
            int longest = 0 ;
            for (int num : set ) {
                if (!set.contains(num-1)){
                    int currentstreak = 1;
                    int current = num ;

                    while (set.contains(current+1))
                    {
                        current++;
                        currentstreak++;
                    }
                    longest = Math.max(longest , currentstreak );
                }
            }
            return longest;
        }

}

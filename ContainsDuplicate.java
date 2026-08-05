import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Time Complexity -> O(n²)
        //  for (int i = 0 ; i < nums.length ; i ++ )
        //  {
        //     for(int j = i + 1  ; j < nums.length ; j ++)
        //     {
        //         if(nums[i] == nums[j])
        //         {
        //             return true ;
        //         }
        //     }
        //  }
        //  return false ;


        // Time Complexity -> O(n log n)
        // Arrays.sort(nums) ;
        // for ( int i = 0 ; i < nums.length - 1; i ++ )
        // {
        //     if(nums[i] == nums[i + 1])
        //     {
        //         return true ;
        //     }
        // }
        // return false  ;

        // Time Complexity -> o(1)
        Set<Integer> set = new HashSet<>() ;
        for ( int num : nums )
        {
            if(set.contains(num))
            {
                return true ;
            }
            set.add(num) ;
        }

        return false ;
    }
}

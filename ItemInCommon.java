/*
Write a function itemInCommon(array1, array2) that takes two arrays as input and returns true if there is at least one common item between the two lists, false otherwise.
Use a HashMap to solve the problem that creates an O(n) time complexity.
 */

import java.util.HashMap;

public class ItemInCommon {

    public boolean itemInCommon(int [] array1 , int [] array2)
    {
        HashMap<Integer , Boolean> map = new HashMap<>();
        for( int i : array1)
        {
            map.put(i , true) ;
        }
        for( int j  : array2 )
        {
            if( map.get(j) != null ) return true ;
        }

        return false ;

    }

}

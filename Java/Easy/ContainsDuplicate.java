import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> accurance = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            //more optimal, if number exists in set then when you attempt to add it returns false.
            if (!accurance.add(nums[i]))
                return true;

            //first attempt
            //accurance.add(nums[i]);

        }
        //part of first attempt
        //return nums.length > accurance.size();

        return false;

    }

    //failed too much memory used
    /*
    public static boolean containsDuplicate(int [] nums){
        boolean [] appear = new boolean [1_000_000_000];
    
        for(int i = 0; i < nums.length; i++){
            if(appear[nums[i]])
                return true;
            
            appear[nums[i]] = true;
    
        }
        return false;
    
    }
     */

    //failed too slow
    /*
    public static boolean containsDuplicate(int [] nums){
        ArrayList<Integer> appear = new ArrayList<>();
    
    
        for(int i =0; i < nums.length; i++){
            if(appear.contains(nums[i]))
                return true;
            
            appear.add(nums[i]);
        }
    
        return false;
    }
    
     */
}
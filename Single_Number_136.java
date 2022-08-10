import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Single_Number_136 {
    public static void main(String args[]) {
        System.out.println(singleNumberIII(new int []{4,1,2,1,2}));
        System.out.println(singleNumberIII(new int []{1,2,1,3,2,5}));
    }


    public static int singleNumber(int[] nums) {
       HashMap<Integer,Integer> couple = new HashMap<Integer,Integer>();
       for(int i=0; i<nums.length; i++){
            if(couple.containsKey(nums[i])){
                couple.remove(nums[i]);
            } else {
                couple.put(nums[i], 1);
            }
       }
       return (int) couple.keySet().toArray()[0];
    }
    public static int[] singleNumberIII(int[] nums) {
        Set<Integer> setOfInteger = new HashSet<>();
        for(int i=0; i<nums.length; i++){
             if(setOfInteger.contains(nums[i])){
                setOfInteger.remove(nums[i]);
             } else {
                setOfInteger.add(nums[i]);
             }
        }
        return  convertIntSetToStringSet(setOfInteger);
    }
    public static int[] convertIntSetToStringSet(Set<Integer> setOfInteger){
        return setOfInteger.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}

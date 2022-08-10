import java.util.HashMap;

public class Single_Number_136 {
    public static void main(String args[]) {
        System.out.println(singleNumber(new int []{4,1,2,1,2}));
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
}

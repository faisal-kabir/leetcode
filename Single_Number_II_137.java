import java.util.HashMap;

public class Single_Number_II_137 {
    public static void main(String args[]) {
        System.out.println(singleNumber(new int []{2,2,3,2}));
        System.out.println(singleNumber(new int []{0,1,0,1,0,1,99}));
    }


    public static int singleNumber(int[] nums) {
       HashMap<Integer,Integer> couple = new HashMap<Integer,Integer>();
       for(int i=0; i<nums.length; i++){
            if(couple.containsKey(nums[i])){
                if(couple.get(nums[i])==2){
                    couple.remove(nums[i]);
                } else {
                    couple.replace(nums[i], 1, 2);
                }
            } else {
                couple.put(nums[i], 1);
            }
       }
       return (int) couple.keySet().toArray()[0];
    }
}

public class Find_the_Duplicate_Number_287 {
    
    public static void main(String args[]) {
        System.out.println(findDuplicate(new int []{3,1,3,4,2}));
    }


    public static int findDuplicate(int[] nums) {
        Boolean[] copy = new Boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            if(copy[nums[i]]!=null && copy[nums[i]]){
                return nums[i];
            }
            copy[nums[i]]=true;
        }
        return 0;
    }
}

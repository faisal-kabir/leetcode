public class First_Missing_Positive_41 {
    
    public static void main(String args[]) {
        System.out.println(firstMissingPositive(new int []{1,2,0}));
        System.out.println(firstMissingPositive(new int []{3,4,-1,1}));
        System.out.println(firstMissingPositive(new int []{7,8,9,11,12}));
        System.out.println(firstMissingPositive(new int []{2,1}));
    }


    public static int firstMissingPositive(int[] nums) {
        if(nums.length == 0){
            return 1;
        }
        int posInt = 1;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==posInt){
                posInt ++;
            }
        }
        return posInt;
    }
}

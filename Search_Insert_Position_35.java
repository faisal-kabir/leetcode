public class Search_Insert_Position_35 {
    
    public static void main(String args[]) {
       //System.out.println(searchInsert(new int[]{1,3,5,6,7,9,10,14,15,16,23,24}, 17)); //2
       //System.out.println(searchInsert(new int[]{-1,3,5,6}, 0)); //2
       System.out.println(Math.round(Math.pow(1.61803, 30)/Math.sqrt(5)));
    }

    public static int searchInsert(int[] nums, int target) {
        if(target == 0 && nums[0]>=0){
            return 0;
        } else if(nums.length==1){
            if(nums[0]==target){
                return 0;
            } else {
                return 1;
            }
        } else if(nums[0]>target){
            return 1;
        } else if(nums[nums.length-1]<target){
            return nums.length;
        }
        
        int index=1;
        int start = 0;
        int maxLength = nums.length-1;
        while(true){
            
            if(maxLength >= start){
                int mid = start + (maxLength-start)/2;
                if(nums[mid] == target){
                    index = mid;
                    break;
                } else if(nums[mid]< target && target < nums[mid+1]) {
                    index = mid+1;
                    break;
                } else if(nums[mid] > target){
                    maxLength = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                break;
            }
        }

        return index;
    }
}

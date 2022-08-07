public class Binary_Search_704 {
    public static void main(String args[]) {
        System.out.println(search(new int[]{-1,0,5},-1));
    }

    public static int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            } else {
                return -1;
            }
        }
        int index=-1;
        int start = 0;
        int maxLength = nums.length-1;
        while(true){
            
            if(maxLength >= start){
                int mid = start + (maxLength-start)/2;
                System.out.println("Mid = "+mid);
                if(nums[mid] == target){
                    index = mid;
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

public class First_Bad_Version_278{
    public static void main(String args[]) {
       
    }


    public static int firstBadVersion(int n) {
        int index=1;
        int start = 0;
        int maxLength = n-1;
        
        while(true){
            
            if(maxLength >= start){
                int mid = start + (maxLength-start)/2;
                System.out.println("Mid = "+mid);
                if(isBadVersion(mid)) {
                    index = mid;
                    maxLength = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                break;
            }
        }
        System.out.println("Start = "+start+" / end = "+index);

        return index;
    }
}
public class First_Bad_Version_278{
    public static void main(String args[]) {
       
    }


    public static int firstBadVersion(int n) {
        int index=1;
        int start = 0;
        int maxLength = n;
        
        while(true){
            
            if(maxLength >= start){
                int mid = start + (maxLength-start)/2;
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

        return index;
    }
}
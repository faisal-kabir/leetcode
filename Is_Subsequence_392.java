

public class Is_Subsequence_392 {

    public static void main(String args[]) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    /**
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int sequenceIndex = 0;
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(sequenceIndex)){
                sequenceIndex ++;
                if(s.length() == sequenceIndex){
                    break;
                }
            }
        }
        return sequenceIndex == s.length();
    }
}
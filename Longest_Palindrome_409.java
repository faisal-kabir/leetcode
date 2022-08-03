import java.util.*;

public class Longest_Palindrome_409 {
    
  public static void main(String args[]) {
    System.out.println(longestPalindrome("abccccdd"));
    System.out.println(longestPalindrome("dccaaaccd"));
    System.out.println(longestPalindrome("aaabbbbbccdd"));
  }

public static int longestPalindrome(String s) {
    if(s.length()==1) return 1;

    HashMap<Character, Integer> data = new HashMap<Character, Integer>();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (data.containsKey(s.charAt(i))) {
         data.put(s.charAt(i), data.get(s.charAt(i))+1);
      } else {
        data.put(s.charAt(i), 1);
      }
    }
    
    boolean haveOdd = false;
    for (Map.Entry<Character, Integer> set : data.entrySet()) {
        if (set.getValue()%2 == 0) {
            count+=set.getValue();
        } else if(set.getValue()>2){
            haveOdd = true;
            count+=set.getValue()-1;
        } else {
            haveOdd = true;
        }
    }
    if(haveOdd){
        count ++;
    }
    return count;
  }
}

import java.util.*;
public class Reverse_Vowels_of_a_String_345 {
    public static void main(String args[]) {
        //System.out.println(reverseVowels(" "));
        //System.out.println(reverseVowels("ab"));
        //System.out.println(reverseVowels("hello"));
        //System.out.println(reverseVowels("leetcode"));
        //System.out.println(reverseVowels("race a car"));//"raca e car"
        //System.out.println(reverseVowels("Sore was I ere I saw Eros."));//"SorE was I ere I saw eros."
        //System.out.println(reverseVowels("Marge, let's \"went.\" I await news telegram."));
        //System.out.println(reverseVowels("Go hang a salami, I'm a lasagna hog.")); //"Go hang a salamI, i'm a lasagna hog."
    }

    public static String reverseVowels(String s) {
        if(s==null || s.isEmpty() || s==" "){
            return s;
        }
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U"));
        StringBuilder copy = new StringBuilder(s);
    
        int end = copy.length()-1;
        int i=0;
        while(true){
            if(i >= copy.length() || end<=0){
                break;
            }
            if(end<i){
                break;
            }
            System.out.println("Left = "+copy.charAt(i)+" / Right = "+copy.charAt(end)+" / start = "+i+" / End = "+end+" / "+(vowels.contains(copy.charAt(i)+"") && vowels.contains(copy.charAt(end)+"")));
            if(vowels.contains(copy.charAt(i)+"") && vowels.contains(copy.charAt(end)+"")){
                char temp = copy.charAt(i);
                copy.setCharAt(i,copy.charAt(end));
                copy.setCharAt(end,temp);
                i++;
                end--;
                System.out.println(copy);
            } else if(!vowels.contains(copy.charAt(i)+"")){
                i++;
            } else if(!vowels.contains(copy.charAt(end)+"")){
                end--;
            }
        }
        return copy.toString();
    }
}

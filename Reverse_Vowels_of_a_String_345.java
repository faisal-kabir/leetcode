import java.util.*;
import java.util.regex.Pattern;
public class Reverse_Vowels_of_a_String_345 {
    public static void main(String args[]) {
        //System.out.println(reverseVowels("hello"));
        //System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("race a car"));//"raca e car"
        System.out.println(reverseVowels("Sore was I ere I saw Eros."));//"SorE was I ere I saw eros."
    }

    public static String reverseVowels(String s) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U"));
        Set<String> special = new HashSet<>(Arrays.asList("!","#","$","%","&","'","(",")","*","+",",","-",".","/",":",";","<","=",">","?","@","[","]","^","_","`","{","|","}","~"));
        StringBuilder copy = new StringBuilder(s);
    
        int end = copy.length()-1;
        for(int i = copy.length()%2 == 0 ? 0 : 1; i <= copy.length()/2; i++){
            if(copy.charAt(i) == ' '){
                i++;
                continue;
            }
            
            if(copy.charAt(end) == ' ' || special.contains(copy.charAt(end)+"")){
                end--;
                i--;
                continue;
            }
            //System.out.print(copy.charAt(i)+" - "+copy.charAt(end)+" "+i);
            //System.out.print(" "+vowels.contains(copy.charAt(i)+"")+" "+end);
            if(vowels.contains(copy.charAt(i)+"") && vowels.contains(copy.charAt(end)+"")){
                char temp = copy.charAt(i);
                copy.setCharAt(i,copy.charAt(end));
                copy.setCharAt(end,temp);
            }
            end--;
        }
        return copy.toString();
    }
}

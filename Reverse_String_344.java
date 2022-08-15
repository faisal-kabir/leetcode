public class Reverse_String_344 {
    public static void main(String args[]) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s)  {
        int end = s.length-1;
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i]=s[end];
            s[end]=temp;
            end--;
        }
    }
}

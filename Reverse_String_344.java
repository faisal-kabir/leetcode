public class Reverse_String_344 {
    public static void main(String args[]) {
        System.out.println(reverseString(new char[]{'h','e','l','l','o'}));
    }

    public static char[] reverseString(char[] s)  {
        if(s==null || s.length==0){
            return s;
        }
    
        int end = s.length-1;
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i]=s[end];
            s[end]=temp;
            end--;
        }
        return s;
    }
}

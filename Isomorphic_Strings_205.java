import java.util.*;

public class Isomorphic_Strings_205 {
  public static void main(String args[]) {
    String s = "abcdefghijklmnopqrstuvwxyzva", t = "abcdefghijklmnopqrstuvwxyzck";
    System.out.println(isIsomorphic(s, t));
  }

  public static boolean isIsomorphic(String s, String t) {
    HashMap<String, Integer> data = new HashMap<String, Integer>();
    HashMap<String, Integer> data2 = new HashMap<String, Integer>();

    int sequence = 0, sequence2 = 0;
    String match = "", match2 = "";
    for (int i = 0; i < s.length(); i++) {
      if (data.containsKey(s.charAt(i) + "")) {
        match = match + data.get(s.charAt(i) + "") + ",";
      } else {
        data.put(s.charAt(i) + "", sequence);
        match = match + sequence + ",";
        sequence++;
      }

      if (data2.containsKey(t.charAt(i) + "")) {
        match2 = match2 + data2.get(t.charAt(i) + "") + ",";
      } else {
        data2.put(t.charAt(i) + "", sequence2);
        match2 = match2 + sequence2 + ",";
        sequence2++;
      }
    }
    // System.out.println(match);
    // System.out.println(match2);

    return match.equals(match2);
  }
}
import java.util.*;
public class SProblem9{
    public static int longestSubstring(String s) {
      HashSet<Character> set= new HashSet<>();
      int left=0; int maxlength=0;
      for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
          set.remove(s.charAt(left));
          left++;
        }
        set.add(s.charAt(right));
        maxlength=Math.max(maxlength,right-left+1);
      }
      return maxlength;
    }
   public static void main(String[] args) {
        String s = "abcdecbb";
        System.out.println(longestSubstring(s));
    }
}
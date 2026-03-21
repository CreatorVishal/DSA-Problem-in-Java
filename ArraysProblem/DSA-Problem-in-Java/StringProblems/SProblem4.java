import java.util.*;
public class SProblem4{
  public static String removeDuplicates(String s) {
    StringBuilder result= new StringBuilder();
    result.append(s.charAt(0));
    for(int i=1;i<s.length();i++){
      if(s.charAt(i)!=s.charAt(i-1)){
        result.append(s.charAt(i));
      }
    }
    return result.toString();

  } 
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(removeDuplicates(s));
    }
}
import java.util.*;
public class SProblem3{
  public static boolean isValid(String s) {
    Deque<Character> stack= new ArrayDeque<>();
    for(char ch : s.toCharArray()){
      if(ch=='('){
        stack.push(')');
      }
      else if(ch=='{'){
        stack.push('}');
      }
      else if(ch=='['){
        stack.push(']');
      }
      else{
        if(stack.isEmpty()|| stack.pop()!=ch){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
    public static void main(String[] args) {
        String s = "({[]})";   // yahan input change karke test kar

        if (isValid(s)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
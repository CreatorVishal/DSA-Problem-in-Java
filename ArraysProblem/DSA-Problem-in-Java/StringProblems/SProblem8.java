import java.util.*;
public class SProblem8{
  public static void main(String[] args) {
    String str = "geeksforgeeks";
    HashMap<Character,Integer> map= new HashMap<>();
    for(char ch: str.toCharArray()){
      map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(char ch: str.toCharArray()){
      if(map.get(ch)>1){
        System.out.println("["+ch+","+map.get(ch)+"]");
        map.put(ch,0);
      }
    }
  }
}
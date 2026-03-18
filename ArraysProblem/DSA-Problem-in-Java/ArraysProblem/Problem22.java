import java.util.*;
public class Problem22{
   public static String largestNumber(int[] arr) {
    String[] nums= new String[arr.length];
    
     // convert int → String
    for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
    }
    Arrays.sort(nums,(a,b) -> (b+a).compareTo(a+b));
   //edge case
    if(nums[0].equals("0")) return "0";

   
    StringBuilder result= new StringBuilder();
    for(String s:nums){
    result.append(s);

    }

   
   return result.toString();
   }
  public static void main(String[] args) {
     int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
  }
}
import java.util.*;
public class Problem23{
  public static String largestNumber(int[] arr) {
    String[] nums= new String[arr.length];
    for(int i=0;i<arr.length;i++){
      nums[i]=String.valueOf(arr[i]);
    }
    Arrays.sort(nums,((a,b)->(a+b).compareTo(b+a)));
    if(nums[0].equals("0")) return nums[0];

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
import java.util.*;
public class Problem13{
  public static int maxProduct(int nums[]){
    int n=nums.length;
    int max=nums[0];
    int min=nums[0];
    int ans=nums[0];
    for(int i=1;i<n;i++){
      if(nums[i]<0){
        int temp=max;
        max=min;
        min=temp; 
      }
      max=Math.max(max,nums[i]*max);
      min=Math.min(min,nums[i]*min);
      
      ans=Math.max(max,ans);
    }
    return ans;
  }
  public static void main(String[] args) {
    int nums[]={2,3,-2,4};
    int result=maxProduct(nums);
    System.out.println(result);
    
  }
}
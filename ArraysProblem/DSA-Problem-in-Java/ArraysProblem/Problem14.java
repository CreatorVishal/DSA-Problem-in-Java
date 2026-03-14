public class Problem14{
  public static int FindMinimum(int nums[]){
    int l=0;
    int r=nums.length-1;
    while(l<r){
      int mid=(l+r)/2;
      if(nums[mid]>nums[r]){
        l=mid+1;
      }
      else{
        r=mid;
      }
    }
    return nums[l];
  } 
  public static void main(String[] args) {
    int arr[]={4,5,6,7,1,2,3};
    int result=FindMinimum(arr);
    System.out.println(result);
    
  }
}
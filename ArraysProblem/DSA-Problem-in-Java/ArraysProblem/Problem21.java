// Find minimum number of merge operations to make an array palindrome
public class Problem21{
  public static int minMerge(int[] arr) {
    int i=0;
    int j=arr.length-1;
    int count=0;
    while(i<j){
      if(arr[i]==arr[j]){
        i++;
        j--;
      }
      else if(arr[i]<arr[j]){
        arr[i+1]=arr[i]+arr[i+1];
        i++;
        count++;
      }
      else{
        arr[j-1]=arr[j]+arr[j-1];
        j--;
        count++;
      }
    }
    return count;
  }
   public static void main(String[] args) {
        int[] arr = {11, 14, 15, 99};
        System.out.println(minMerge(arr));
    }
}
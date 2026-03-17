import java.util.*;
public class Problem19{
  public static int KthSmallest(int arr[],int k){
    PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<arr.length;i++){
      maxHeap.add(arr[i]);
      if(maxHeap.size()>k){
        maxHeap.poll();
      }
    }
    return maxHeap.peek();
  }
  public static void main(String[] args) {
    int arr[] = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
    int result=KthSmallest(arr,4);
    System.out.println(result);
    
  }
}
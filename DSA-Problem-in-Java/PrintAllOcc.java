public class PrintAllOcc {
  //  public static void occ(int arr[],int key,int i){
  //   //Base case
  //   if(i==arr.length){
  //     System.out.println("Array has finished ");
  //     return;
  //   }
  //   if(arr[i]==key){
  //     System.out.println(i);
  //   }
  //   occ(arr, key, i+1);

    
  // }
  //  static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
  //  public static void Convert(int n){
  //   if(n==0){
  //     return;

  //   }
  //   Convert(n/10);
  //   int digit= n%10;
  //   System.out.println(arr[digit]+" ");
  //  }
 public static int length(String str){
  if(str.length()==0){
    return 0;
  }
  return length(str.substring(1))+1;

 }
    public static void main(String[] args) {
    int n=2020;
    // Convert(n);
    // int key=2;
    // int arr[]={3,2,4,5,6,2,7,2,2};
    // printDec(n);
    // printInc(n);
    // System.out.println(fact(n));
    // occ(arr, key,0);
    String str= "abcdfffff";
    System.out.println(length(str));

    
  }
  
}

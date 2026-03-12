public class recP1{
  // public static void printDec(int n){
  //   //Base case 
  //   if(n==1){
  //     System.out.println(n);
  //     return;

  //   }
  //   System.out.println(n+" ");
  //   printDec(n-1);
  // }
  // public static void printInc(int n){
  //   //Base case
  //   if(n==1){
  //     System.out.println(n);
  //     return;

  //   }
  //   printInc(n-1);
  //   System.out.println(n+" ");
  // }
  // public static int fact(int n){
  //   if(n==0){
  //     return 1;
  //   }
  //   return n*fact(n-1);


  // } 
 
  public static void main(String[] args) {
    int key=2;
    int arr[]={3,2,4,5,6,2,7,2,2};
    // printDec(n);
    // printInc(n);
    // System.out.println(fact(n));
    occ(arr, key,0);

    
  }
} 
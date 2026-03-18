import java.util.*;
public class Problem24{
   public static void printMultiples(int a, int b) {
    int n=(b-a)+1;
    int mask=0;
    for(int i=0;i<n;i++){
      int num=a+i;
      if((num%2==0) || (num%5==0)){
        mask|= (1<<i);
      }
    }
    for(int i=0;i<n;i++){
      if((mask & (1<<i)) !=0){
        System.out.println((a+i)+" ");
      }
    }
    
   }
   public static void main(String[] args) {
        printMultiples(2, 6);
    }
}

//Optimal solution 
// public class Problem24 {
//     public static void printMultiples(int a, int b) {
//         for (int i = a; i <= b; i++) {
//             if (i % 2 == 0 || i % 5 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         printMultiples(2, 6);
//     }
// }
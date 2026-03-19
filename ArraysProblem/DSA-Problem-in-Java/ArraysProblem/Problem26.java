import java.util.*;
public class Problem26{
   public static void generate(int[] arr, int r, int index, ArrayList<Integer> current) {
    //base case 
    if(current.size()==r){
      System.out.println(current);
      return;
    }
    for(int i=index;i<arr.length;i++){

    // Step-1 pick element
    current.add(arr[i]);

    //Step-2 recurse function call
    generate(arr,r,i+1,current);

    //Step-3 backtracking
    current.remove(current.size()-1);
    }

    
          
   }
   public static void main(String[] args) {

        
        int[] arr = {1, 2, 3, 4};
        int r = 2;

        ArrayList<Integer> current = new ArrayList<>();

        generate(arr, r, 0, current);
    }
}
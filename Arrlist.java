// import java.util.ArrayList;
// import java.util.Collections;
// --------------OR
import java.util.*; 

public class Arrlist {
  public static void swap(ArrayList<Integer> list, int idx1,int idx2){
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
    

  }
  public static void main(String[] args) {
    // Java collection framework
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

    // operation

    // add

    list.add(1);// O(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    // Get operation O(1)
    System.out.println("----------------------------------------");
    int element = list.get(3);
    System.out.println(element);

    //Remove element or Delete O(n)
    System.out.println("----------------------------------------");

    list.remove(3);
    System.out.println(list);

    //Set element
    System.out.println("----------------------------------------");


    list.set(3,22);
    System.out.println(list);

    //Contains Element
    System.out.println("----------------------------------------");
    System.out.println(list.contains(22));
    System.out.println(list.contains(5));

    //Add
    System.out.println("----------------------------------------");
    list.add(1,10);
    System.out.println(list);



    // -----------------------------------------------
    //Size of
    System.out.println(list.size());

    //print the arralist
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();

    //Print Reverse of an arrlist
    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();

    //Find Maximum in an Arraylist
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      // if(max<list.get(i)){
      //   max=list.get(i);
      // }
      //OR
      max=Math.max(max,list.get(i));
    } 
    System.out.print(max);

    //Swap 2 Numbers
     System.out.println("----------------------------------------");
    int idx1=1,idx2=2;
    System.out.println(list);
    swap(list, idx1, idx2);
    System.out.println(list);



    //SORTING AN ARRAYLIST
    System.out.println("-------------------------");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);//Ascending order

    //Descneding order
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);

    //---------------------MultiDimensional Arraylist------------------------
    ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
    ArrayList<Integer> list1 =  new ArrayList<>();
    list1.add(1); list1.add(2);
    mainList.add(list1);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);list2.add(4);
    mainList.add(list2);

    for(int i=0;i<mainList.size();i++){
      ArrayList<Integer> currList= mainList.get(i);
      for(int j=0;j<currList.size();j++){
        System.out.print(currList.get(j)+" ");
      }
      System.out.println();

    }
    System.out.println(mainList);



  }

}

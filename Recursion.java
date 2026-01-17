public class Recursion {
  public static void printDec(int n) {
    // Base case
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    printDec(n - 1);
  }

  public static void printInc(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printInc(n - 1);
    System.out.print(n + " ");
  }

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    int fnm1 = fact(n - 1);
    int fn = n * fnm1;
    return fn;
  }

  public static int calcSum(int n) {
    if (n == 1) {
      return 1;

    }
    int Snm1 = calcSum(n - 1);
    int Sn = n + Snm1;
    return Sn;
  }

  public static int fib(int n) {
    if (n == 0 || n == 1) {
      return n;

    }
    int fnm1 = fib(n - 1);
    int fnm2 = fib(n - 2);
    int fn = fnm1 + fnm2;
    return fn;

  }

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {
      return false;
    }
    return isSorted(arr, i + 1);

  }

  public static int firstOcc(int arr1[], int key , int i){
    //base case 
    if(i==arr1.length){
      return -1;
    }
    if(arr1[i]==key){
      return i;
    }

    return firstOcc(arr1, key, i+1);
  }  
  public static int lastOcc(int arr1[],int key,int i){
    if(i==arr1.length){
      return -1;
    }

    int isFound = lastOcc(arr1, key, i+1);
    if(isFound == -1 && arr1[i]==key){
      return i;
    }
    return isFound;

  }
  public static int power(int x,int n){
    //BASE CASE
    if(n==0){
      return 1;
    }
    // int xnm1= power(x,n-1);
    // int xn= x* xnm1;
    // return xn;

    //OR 
    return x * power(x,n-1);
  }
  public static int optimizedPower(int a,int n){
    //Base case 
    if(n==0){
      return 1;

    }
    int half=optimizedPower(a, n/2);
    int halfSquare=half*half;

    if(n%2!=0){
      halfSquare=a* halfSquare;
    }
    return halfSquare;
  }
  public static int HidingProblem(int n){
    //base case 
    if(n==0 || n==1 ){
      return 1;
    }
    return HidingProblem(n-1)+HidingProblem(n-2);

  } 

  public static void removeDup(String str , int idx, StringBuilder newStr , boolean map[]){
    if(idx==str.length()){
      System.out.println(newStr);
      return;
    }
    //Kaam

    char currChar= str.charAt(idx);
    if(map[currChar-'a']==true){
      removeDup(str, idx+1, newStr, map);
    }
    else{
      map[currChar - 'a'] =true;
      removeDup(str, idx+1, newStr.append(currChar), map);
    }

  } 

  public static void main(String[] args) {
    int n = 6;
    String str = "appnnacollege";
    // int arr[] = { 2, 4, 3 , 9, 11 };
    int arr1[]= {8,3,6,9,5,10,2,5,3};
    printDec(n);
    printInc(n);

    System.out.println(fact(n));

    System.out.println(calcSum(n));
    System.out.println(fib(n));
    // System.out.println(isSorted(arr, 0));

    System.out.println(firstOcc(arr1,5 , 0));
    System.out.println(lastOcc(arr1,5 , 0));
    System.out.println(power(2, 10));
    System.out.println(optimizedPower(2, 5));
    System.out.println(HidingProblem(3));

    
    removeDup(str, 0, new StringBuilder(""),new boolean[26]);



  }
}
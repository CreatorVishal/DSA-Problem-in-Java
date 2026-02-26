public class DAC {
  // public static void printArr(String str[]) {
  // for (int i = 0; i < str.length; i++) {
  // System.out.println(str[i] + "");
  // }
  // System.out.println();
  // }

  // public static void sort(String str[], int si, int ei) {
  // if (si >= ei) {
  // return;
  // }
  // int mid = si + (ei - si) / 2;
  // sort(str, si, mid);
  // sort(str, mid + 1, ei);
  // merge(str, si, mid, ei);

  // }

  // public static void merge(String str[], int si, int mid, int ei) {
  // String temp[] = new String[ei - si + 1];
  // int i = si;
  // int j = mid + 1;
  // int k = 0;
  // while (i <= mid && j <= ei) {
  // int result = str[i].compareToIgnoreCase(str[j]);
  // if (result < 0) {
  // temp[k] = str[i];
  // i++;
  // } else {
  // temp[k] = str[j];
  // j++;
  // }
  // k++;
  // }

  // while (i <= mid) {
  // temp[k++] = str[i++];
  // }
  // while (j <= ei) {
  // temp[k++] = str[j++];
  // }
  // for (k = 0, i = si; k < temp.length; k++, i++) {
  // str[i] = temp[k];

  // }

  // }
  // private static int countInRange(int arr[],int num,int si,int ei ){
  // int count=0;
  // for(int i=si;i<ei;i++){
  // if(arr[i]==num){
  // count++;
  // }
  // }
  // return count;

  // }

  // public static int majority(int arr[], int si, int ei) {
  // // base case
  // if(si==ei){
  // return arr[si];
  // }

  // // kaam
  // int mid = si + (ei - si) / 2;
  // int left = majority(arr, si, mid);
  // int right = majority(arr, mid + 1, ei);
  // if(left==right){
  // return left;

  // }
  // //otherwise
  // int leftCount=countInRange(arr,left,si,ei);
  // int rightCount=countInRange(arr,right,si,ei);
  // return (leftCount>rightCount?left:right);

  // }
  public static int merge(int arr[], int si, int mid, int ei) {
    int i = si, j = mid, k = 0;
    int inv = 0;
    int temp[] = new int[(ei - si + 1)];
    while ((i < mid) && (j <= ei)) {
      if (arr[i] <= arr[j]) {
        temp[k] = arr[i];
        k++;
        i++;
      } else {
        temp[k] = arr[j];
        inv += (mid - i);
        k++;
        j++;
      }

    }
    while (i < mid) {
      temp[k++] = arr[i++];
    }
    while (j <= ei) {
      temp[k++] = arr[i++];
    }
    for (i = si, k = 0; i <= ei; i++, k++) {
      arr[i] = temp[k];
    }
    return inv;
  }

  public static int mergeSort(int arr[], int si, int ei) {
    int inv = 0;
    if (ei > si) {
      int mid = (ei + si) / 2;
      inv = mergeSort(arr, si, mid);
      inv += mergeSort(arr, mid + 1, ei);
      inv += merge(arr, si, mid, ei);
    }
    return inv;
  }

  public static void main(String[] args) {
    // String str[] = { "sun", "earth", "mars", "mercury" };
    // sort(str, 0, str.length - 1);
    // printArr(str);
    // int[] arr = {3,2,3};
    // System.out.println("Congratulations!Majority element is : "+majority(arr, 0,
    // arr.length - 1));
    int[] arr = { 1, 20, 6, 4, 5 };
    System.out.println(mergeSort(arr, 0, arr.length - 1));
  }

}

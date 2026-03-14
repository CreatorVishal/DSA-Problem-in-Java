public class Problem15 {

    static boolean pairInSortedRotated(int[] arr, int target) {

        int n = arr.length;

        // Step 1: find pivot
        int pivot = -1;

        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: pointers
        int left = (pivot + 1) % n; // smallest
        int right = pivot;          // largest

        // Step 3: circular two pointer
        while(left != right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            }

            if(sum < target){
                left = (left + 1) % n;
            }
            else{
                right = (n + right - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if(pairInSortedRotated(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
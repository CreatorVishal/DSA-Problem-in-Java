public class GreedyP2 {

    public static int kthOdd(int arr[], int k) {

        if (k <= 0) {
            return -1;
        }

        int L = arr[0];
        int R = arr[1];

        // Step 1: Find largest odd in range
        int largestOdd;
        if (R % 2 != 0) {
            largestOdd = R;
        } else {
            largestOdd = R - 1;
        }

        // Step 2: Calculate kth largest odd
        int result = largestOdd - (k - 1) * 2;

        // Step 3: Check if within range
        if (result < L) {
            return -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -10, 7 };
        int k = 3;
        System.out.println(kthOdd(arr, k));
    }
}
import java.util.*;

public class Problem12 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];

        // prefix
        answer[0] = 1;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        // suffix
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        int[] result = productExceptSelf(arr);

        System.out.println(Arrays.toString(result));
    }
}
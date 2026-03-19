import java.util.*;

public class Problem25 {

    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        map.put(0, -1); // important

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int mod = sum % k;

            if (mod < 0) {
                mod += k;
            }

            if (map.containsKey(mod)) {
                int prevIndex = map.get(mod);
                int len = i - prevIndex;
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(mod, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;

        int result = longestSubarray(arr, k);

        System.out.println("Answer: " + result);
    }
}
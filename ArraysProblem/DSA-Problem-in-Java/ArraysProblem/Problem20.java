import java.util.*;

public class Problem20{

    public static int[][] merge(int[][] intervals) {

        // Step 1: sort based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
   // Step 2: result list
        List<int[]> result = new ArrayList<>();

        // Step 3: first interval
        int[] current = intervals[0];
        result.add(current);
    for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                // merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                result.add(current);
            }
        }

    return result.toArray(new int[0][]);
  }
  public static void main(String[] args) {
   int[][] intervals = {
            {7, 8},
            {1, 5},
            {2, 4},
            {4, 6}
        };

        int[][] result = merge(intervals);

        // print result
        for (int[] arr : result) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
    
  }

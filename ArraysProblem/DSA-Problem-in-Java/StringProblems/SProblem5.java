// public class SProblem5 {
//     public static String longestCommonPrefix(String[] strs) {
//         if (strs.length == 0) return "";

//         String first = strs[0];

//         for (int i = 0; i < first.length(); i++) {
//             char ch = first.charAt(i);

//             for (int j = 1; j < strs.length; j++) {
//                 if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
//                     return first.substring(0, i);
//                 }
//             }
//         }

//         return first;
//     }

//     public static void main(String[] args) {
//         String[] strs = {"flower","flow","flight"};
//         System.out.println(longestCommonPrefix(strs));
//     }
// }


// -------------Super optimal ---------
import java.util.*;

public class SProblem5 {

    public static String longestCommonPrefix(String[] strs) {
        // Step 1: sort array
        Arrays.sort(strs);

        // Step 2: first & last string
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Step 3: compare character by character
        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        // Step 4: return prefix
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
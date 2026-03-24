import java.util.*;

public class SProblem11 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // step 1: sort the word
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // step 2: map me store karo
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}

public class SProblem2 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        // count increase (s)
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // count decrease (t)
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // check all zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
    }
}
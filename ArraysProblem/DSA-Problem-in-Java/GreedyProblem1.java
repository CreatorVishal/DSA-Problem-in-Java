public class GreedyProblem1 {
  public static int stringP(String str) {
    int l = 0;
    int r = 0;
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'L') {
        l++;
      } else {
        r++;
      }
      if (l == r) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String str = "LRRRRLLRLLRL";
    System.out.println(stringP(str));
  }

}

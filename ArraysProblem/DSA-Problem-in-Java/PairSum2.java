import java.util.ArrayList;

public class PairSum2 {
  public static int[] pairsum(ArrayList<Integer> list, int target) {
    int pivot = -1;
    for (int i = 0; i < list.size()-1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        pivot = i;
      }

    }
    int lp = pivot + 1;
    int rp = pivot;
    int n = list.size();
    while (lp != rp) {
      if (list.get(lp) + list.get(rp) == target) {
        return new int[] { lp, rp };
      } else if (list.get(lp) + list.get(rp) < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (rp + n - 1) % n;
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // 11,15,6,8,9,10 Sorted & Rotated
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    int arr[] = pairsum(list, target);
    System.out.print("[");
    for (var i : arr) {
      System.out.print(i + " ");
    }
     System.out.print("]");

  }

}

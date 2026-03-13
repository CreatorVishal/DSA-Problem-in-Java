import java.util.*;
public class Problem11 {
    public static int TrappingRainwater(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            if (leftMax < rightMax) {
                ans += leftMax - height[left];
                left++;
            } else {
                ans += rightMax - height[right];
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        int result = TrappingRainwater(height);
        System.out.println(result);
    }
}
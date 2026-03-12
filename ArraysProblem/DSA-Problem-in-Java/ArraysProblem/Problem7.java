import java.util.*;

public class Problem7 {

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void nextPermutation(int[] nums) {

        int pivot = -1;
        int n = nums.length;

        // Step 1: find pivot
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: if pivot not found
        if(pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find next greater element
        for(int i = n - 1; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: reverse right side
        reverse(nums, pivot + 1, n - 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 6, 5, 4};

        nextPermutation(nums);

        System.out.println("Next Permutation:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

public class Sortelements {
    public static void sortColors(int[] nums) {
        int low = 0;          // Pointer for 0
        int mid = 0;          // Pointer for 1
        int high = nums.length - 1;  // Pointer for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 1, 0};
        sortColors(nums);

        System.out.println("Sorted Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

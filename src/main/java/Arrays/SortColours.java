
//Sort Array of 0s, 1s and 2s (Dutch National Flag Problem)
//No sorting function allowed.

package Arrays;

public class SortColours {

    public static void main(String[] args) {
        // Input array
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Original Array:");
        printArray(nums);

        // Sorting the array
        sortColors(nums);

        System.out.println("Sorted Array:");
        printArray(nums);
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


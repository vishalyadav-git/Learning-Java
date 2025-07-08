public class RotatedBinSearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            // Left part is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // Search left
                } else {
                    low = mid + 1;   // Search right
                }
            }
            // Right part is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;   // Search right
                } else {
                    high = mid - 1;  // Search left
                }
            }
        }

        return -1;  // Not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(nums, target);
        System.out.println("Index of " + target + ": " + index);
    }
}

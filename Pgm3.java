//**Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// **Example 1:**
// Input: nums = [1,3,5,6], target = 5

// Output: 2


class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;           // Left pointer
        int right = nums.length - 1;  // Right pointer

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate the middle index

            if (nums[mid] == target) {
                // If the target is found, return the middle index
                return mid;
            } else if (nums[mid] < target) {
                // If the middle element is smaller than the target, search in the right half
                left = mid + 1;
            } else {
                // If the middle element is larger than the target, search in the left half
                right = mid - 1;
            }
        }

        // If the target is not found, return the index where it would be inserted
        return left;
    }
}

// Example usage
public class Pgm3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        
        Solution solution = new Solution();
        int index = solution.searchInsert(nums, target);
        
        System.out.println("Index: " + index);  // Output: 2
    }
}

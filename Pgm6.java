//**Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// **Example 1:**
// Input: nums = [1,2,3,1]

// Output: true



import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // Check if the element is already in the set
            if (set.contains(num)) {
                // If a duplicate is found, return true
                return true;
            } else {
                // Otherwise, add the element to the set
                set.add(num);
            }
        }

        // If no duplicates are found, return false
        return false;
    }
}

// Example usage
public class Pgm6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Solution solution = new Solution();
        boolean result = solution.containsDuplicate(nums);

        System.out.println("Result: " + result);  // Output: true
    }
}

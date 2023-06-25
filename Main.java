//**Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// - Return k.

// **Example :**
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_*,_*]

// **Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[



class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // Pointer to the current position
        
        // Iterate through the array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                // If the current element is not equal to val, move it to the correct position
                nums[i] = nums[j];
                i++;
            }
        }
        
        // Return the count of elements that are not equal to val
        return i;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        Solution solution = new Solution();
        int count = solution.removeElement(nums, val);
        
        System.out.println("Count: " + count);  // Output: 2
        
        System.out.print("Updated nums: ");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");  // Output: 2 2
        }
    }
}

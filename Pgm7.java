//**Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]



public class Pgm7 {
    public static void moveZeroes(int[] nums) {
        int left = 0; // pointer to track the position for non-zero elements
        
        // iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap non-zero element with the left pointer position
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

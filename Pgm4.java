//**Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// **Example 1:**
// Input: digits = [1,2,3]
// Output: [1,2,4]

// **Explanation:** The array represents the integer 123.

// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4]


import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through the digits in reverse order
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, simply increment it by one and return the array
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }

        // If all digits are 9, create a new array with an additional leading digit 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}

// Example usage
public class Pgm4 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        
        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);
        
        System.out.println("Result: " + Arrays.toString(result));  // Output: [1, 2, 4]
    }
}

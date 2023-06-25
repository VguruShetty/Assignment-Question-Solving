//**Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]



import java.util.*;

public class Pgm8 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();
        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {
            if (numSet.contains(num)) {
                duplicate = num;
            }
            numSet.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!numSet.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

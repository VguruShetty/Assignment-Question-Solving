//**Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// **Example:**
// Input: nums = [2,7,11,15], target = 9
// Output0 [0,1]

// **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]


import java.util.HashMap;
import java.util.Map;

class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> complementMap = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(complementMap.containsKey(complement)){
                return new int[] {complementMap.get(complement),i};
            }else{
                complementMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}

public class HelloWorld{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for(int index: result){
            System.out.print(index + "");
        }
    }
}
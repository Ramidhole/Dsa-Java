
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // check if complement already exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // store current number with index
            map.put(nums[i], i);
        }

        return new int[]{}; // no solution (just for safety)
    }
}

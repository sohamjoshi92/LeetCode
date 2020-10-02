/** TWO SUM */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int comp = target - nums[i];
            if(m.containsKey(comp))
            {
                result = new int[]{m.get(comp), i};
                break;
            }
            else m.put(nums[i], i);
        }
        return result;
    }
}
/**FIND ALL NUMBERS DISAPPERED IN AN ARRAY */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) nums[index] *= -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0) r.add(i+1);
        }
        return r;
    }
}
/* MOVE ZEROS */

class Solution {
    public void moveZeroes(int[] nums) {
        int fnz=0;
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                temp = nums[i];
                nums[i] = nums[fnz];
                nums[fnz++] = temp;
            }
        }
        return;
    }
}
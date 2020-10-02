/** MAXIMUM SUBARRAY */

class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE, me = 0;
        for(int i=0;i<nums.length;i++)
        {
            me = me + nums[i];
            if(me > ms) ms = me;
            if(me < 0) me = 0;
        }
        return ms;
    }
}
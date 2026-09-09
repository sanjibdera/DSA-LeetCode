class Solution {
    public boolean canJump(int[] nums) {
        int dest = nums.length - 1;
        for(int  idx = nums.length - 2; idx >= 0; idx--){
            if(idx + nums[idx] >= dest) 
                dest = idx;
        }
        return dest == 0;
    }
}
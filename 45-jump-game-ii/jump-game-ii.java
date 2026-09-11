class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;
        int farEnd = 0;

        for(int  i = 0; i < nums.length - 1; i++){

            // Find the farthest index we can reach
            farEnd = Math.max(farEnd, i + nums[i]);

            if(i == currEnd){
                currEnd = farEnd;
                jumps++;
            }
        }
        return jumps;
    }
}
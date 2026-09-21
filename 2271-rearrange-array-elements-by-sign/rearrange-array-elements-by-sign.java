class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int poidx = 0;
        int neidx = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result[poidx] = nums[i];
                poidx += 2;
            }else{
                result[neidx] = nums[i];
                neidx += 2;
            }
        }
        return result;
    }
}
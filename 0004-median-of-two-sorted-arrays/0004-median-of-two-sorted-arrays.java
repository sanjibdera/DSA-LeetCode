class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] res = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length || j < nums2.length){
            if(i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])){
                res[k] = nums1[i];
                i++;
            } else{
                res[k] = nums2[j];
                j++;
            }
            if(k == res.length / 2)
                break;
            k++;
        }
        if(res.length % 2 == 0){
            int mid = res.length/2;
            return (res[mid] + res [mid - 1]) / 2.0;
        }else{
            return res[res.length/2];
        }
    }
}
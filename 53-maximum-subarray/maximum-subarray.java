class Solution {
    public int maxSubArray(int[] nums) {
        int s=0, max=Integer.MIN_VALUE;
        for(int num: nums){
            s+=num;
            max=Math.max(max,s);
            if(s<0) s=0;
        }
        return max;
    }
}
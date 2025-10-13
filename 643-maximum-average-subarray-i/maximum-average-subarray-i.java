class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length,l=0,r=0,s=0;
        double max=Double.NEGATIVE_INFINITY;

        while(r<n){
            s+=nums[r];
            if(r-l+1==k) max=Math.max(s,max);
        
            if(r-l+1>=k){
                s-=nums[l];
                l++;
            }
            r++;
        }

        return (double)max/k;
    }
}
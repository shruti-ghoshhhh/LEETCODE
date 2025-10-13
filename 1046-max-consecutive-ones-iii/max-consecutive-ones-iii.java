class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0,c=0, max=0, len=0;

        while(r<n){
            if(nums[r]==0) c++;

            while(c>k){
                if(nums[l]==0) c--;
                l++;
            }

            len=r-l+1;
            max=Math.max(max,len);
            r++;
        }

        return max;
    }
}
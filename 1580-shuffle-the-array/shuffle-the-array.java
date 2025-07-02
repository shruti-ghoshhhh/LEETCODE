class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuff[]=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            shuff[j++]=nums[i];
            shuff[j++]=nums[i+n];
        }
        
        return shuff;
    }
}
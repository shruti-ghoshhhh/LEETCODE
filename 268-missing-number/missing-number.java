class Solution {
    public int missingNumber(int[] nums) {
        int hash[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]=1;
        }
        for(int i=0;i<nums.length+1;i++){
            if(hash[i]==0) return i;
        }

        return -1;
    }
}
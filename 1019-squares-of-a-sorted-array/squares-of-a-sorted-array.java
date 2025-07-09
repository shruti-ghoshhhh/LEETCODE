class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            int j=i-1;
            while(j>=0 && k<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=k;
        }

        return nums;
    }
}
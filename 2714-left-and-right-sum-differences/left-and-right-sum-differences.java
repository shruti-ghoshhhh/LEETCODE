class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftsum=0, rightsum=0;
            for(int j=0;j<i;j++)
            {
                leftsum+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                rightsum+=nums[k];
            }
            arr[i]=Math.abs(leftsum-rightsum);
        }
        return arr;
    }
}
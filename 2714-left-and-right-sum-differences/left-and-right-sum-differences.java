class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        int leftsum=0, rightsum=0;

        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            arr[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return arr;
    }
}
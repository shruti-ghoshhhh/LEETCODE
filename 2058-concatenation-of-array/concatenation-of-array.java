class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int arr[]=new int[2*l];
        for(int i=l;i<2*l;i++){
            arr[i]=nums[i-l];
            arr[i-l]=nums[i-l];
        }
        return arr;
    }
}
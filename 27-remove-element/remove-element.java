class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0, p=0;
        for(int i=0; i<nums.length;i++){

        if(nums[i]!=val)
        {
            nums[i-c]=nums[i];
            p++;
        }
        else{ c++; }

        // return p;
        }
        return p;
    }
}
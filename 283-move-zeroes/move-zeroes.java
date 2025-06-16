class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - c] = nums[i];
            } else {
                c++;
            }
        }
        for (int i = nums.length - c; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

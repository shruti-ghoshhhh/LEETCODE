class Solution {
    public int minStartValue(int[] nums) {
        int s=0, min=0;
        for(int num: nums){
            s+=num;
            min=Math.min(min,s);
        }
        return 1-min;
    }
}
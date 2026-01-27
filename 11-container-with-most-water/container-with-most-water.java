class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(left<right){
            int width=right-left;
            min=Math.min(height[left], height[right]);
            max=Math.max(max, min*width);

            if(min==height[left]) left++;
            else right--;

        }

        return max;
    }
}
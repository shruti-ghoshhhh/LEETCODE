class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            int currIndex=i%n;
            int currValue=nums[currIndex];

            while(!stack.isEmpty() && currValue>nums[stack.peek()]){
                int prevIndex=stack.pop();
                ans[prevIndex]=currValue;
            }
            stack.push(currIndex);
        }
        return ans;
    }
}
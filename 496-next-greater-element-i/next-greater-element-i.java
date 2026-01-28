class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<nums2.length;i++){
            int curr=nums2[i];
            while(!stack.isEmpty() && curr>stack.peek()){
                int smaller=stack.pop();
                map.put(smaller,curr);
            }
            stack.push(curr);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }

        return res;
    }
}
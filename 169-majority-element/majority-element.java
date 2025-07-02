class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);
        }
    int max=Integer.MIN_VALUE, maxKey=Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>max) {
                max=e.getValue();
                maxKey=e.getKey();
        }
    }
        return maxKey;
}
}
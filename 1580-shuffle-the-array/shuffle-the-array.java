class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        int shuff[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            shuff[i]=list.get(i);
        }
        return shuff;
    }
}
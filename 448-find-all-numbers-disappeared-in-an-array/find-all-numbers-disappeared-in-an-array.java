class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int val: nums){
            int index = Math.abs(val) - 1;
            nums[index] = -Math.abs(nums[index]); 
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) list.add(i+1);
        }

        for (int i = 0; i < nums.length; i++) {
    nums[i] = Math.abs(nums[i]);
}

        
        return list;
    }
}
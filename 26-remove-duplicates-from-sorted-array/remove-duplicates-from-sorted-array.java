class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> set=new ArrayList<>();

        for(int num: nums){
            if(!set.contains(num))
            set.add(num);
        }

        for(int i=0;i<set.size();i++){
            nums[i]=set.get(i);
        }
        
        return set.size();
    }
}
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int c=0,s=0;
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key: map.keySet())
            if(map.get(key)==1){
                s+=key;
            }
        return s;
        }
    }

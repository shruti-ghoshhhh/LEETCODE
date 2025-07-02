class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums){
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num,map.get(num)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()==2) list.add(e.getKey());
        }
        return list;
    }
}
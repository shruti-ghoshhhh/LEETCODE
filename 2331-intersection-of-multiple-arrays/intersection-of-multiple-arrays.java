class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                if(seen.add(nums[i][j])) {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1); }
            }
        }


        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==nums.length) list.add(e.getKey());
        }
        Collections.sort(list);
        return list;
    }
}
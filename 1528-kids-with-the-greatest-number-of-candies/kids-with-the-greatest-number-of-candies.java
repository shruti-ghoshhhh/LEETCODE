class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        ArrayList<Boolean> list=new ArrayList<>();
        for(int candy:candies){
            if(max<candy) max=candy;
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
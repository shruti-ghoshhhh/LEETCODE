class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        for(int i=0; i<candies.length;i++){
                int max=candies[i]+extraCandies;
                int temp=max;
            for(int j=0; j<candies.length;j++){
                if(candies[j]>=max) max=candies[j];
            }
            if(temp==max){
                list.add(true);
            }
            else{
                list.add(false);
            }

        }
        return list;
    }
}
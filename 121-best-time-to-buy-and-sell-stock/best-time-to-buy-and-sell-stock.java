class Solution {
    public int maxProfit(int[] prices) {
        int b=Integer.MAX_VALUE;
        int p=0;
        for(int i:prices)
        {
            if(i<b) b=i;
            else{
                p=Math.max(p, i-b);
            }
        }
        return p;
    }
}
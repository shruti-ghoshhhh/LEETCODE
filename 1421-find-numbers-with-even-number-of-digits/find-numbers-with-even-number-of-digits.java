class Solution {
    public int findNumbers(int[] nums) {
        int p=0;
        for(int x:nums)
        {
        if(String.valueOf(x).length()%2==0){
            p++;
        } }
        
        return p;
    }
}
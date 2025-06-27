class Solution {
    public int sumOfUnique(int[] nums) {
        int c[]=new int[101];
        int s=0;
        for(int num: nums){
            c[num]++;
        }
        for(int i=0; i<101;i++){
            if(c[i]==1){
                s+=i;
            }
        }
        return s;
    }
}
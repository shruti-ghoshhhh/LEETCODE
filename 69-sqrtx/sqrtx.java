class Solution {
    public int mySqrt(int x) {
        int low=0, high=x, s=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid<=x) {
                s=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return s;
    }
}
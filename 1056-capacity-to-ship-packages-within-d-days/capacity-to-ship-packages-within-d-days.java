class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0, high=0, total=0;
        for(int w: weights) {
            low=Math.max(low,w);
            high+=w; 
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            total=check(weights, mid);
            if(total<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return low;
    }

    public int check(int[] weights, int cap){
        int c=1, load=0;
        for(int i=0; i<weights.length;i++){
            if(load+weights[i]>cap){
                c++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }

        return c;
    }
}
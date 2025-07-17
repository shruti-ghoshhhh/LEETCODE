class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerbound(nums,target,0, nums.length-1);
        if(lb==nums.length || nums[lb]!=target) return new int[]{-1,-1};
        
        int ub=upperbound(nums,target,0, nums.length-1)-1;
        return new int[]{lb,ub};
    }

    public int lowerbound(int[] arr, int target, int low, int high){
        int ans=arr.length;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int upperbound(int[] arr, int target, int low, int high){
        int ans=arr.length;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            } 
        }
        return ans;
    }
}
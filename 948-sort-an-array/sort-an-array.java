class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int s, int e){
        if(s>=e) return;
        int mid=s+(e-s)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);
        merge(nums, s, mid, e);
    }

    public void merge(int[] nums, int low, int mid, int high){
        int temp[]=new int[high-low+1];
        int i=low, j=mid+1, k=0;

        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]) temp[k++]=nums[i++];
            else temp[k++]=nums[j++];

        }
            while(i<=mid){
                temp[k++]=nums[i++];
            }
            while(j<=high){
                temp[k++]=nums[j++];
            }

        for(int x=0;x<temp.length;x++){
            nums[low+x]=temp[x];
        }
    }
}
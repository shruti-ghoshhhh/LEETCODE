class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] arr, int i, int n){
        while(i<n){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;

            i++;
            n--;
        }
    }
}
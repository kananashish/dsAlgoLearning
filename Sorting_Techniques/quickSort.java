class Solution {
    public int[] quickSort(int[] nums) {
        int n = nums.length;
        qs(nums,0,n-1);
        return nums;
    }
    private void qs(int[] nums, int low, int high) {
        if(low < high) {
            int pIndex = partition(nums,low,high);
            qs(nums,low,pIndex-1);
            qs(nums,pIndex+1,high);
        }
    }
    private int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        while(i < j){
            while(nums[i] <= pivot && i<high) i++;
            while(nums[j] >= pivot && j>low) j--;
            if(i<j) swap(nums,i,j);
        }
        swap(nums,low,j);
        return j;
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
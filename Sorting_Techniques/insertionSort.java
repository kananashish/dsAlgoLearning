class Solution {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]){
                swap(nums,j,j-1);
                j--;
            }
        }
        return nums;
    }
    private void swap(int[] nums, int j, int k){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
}
class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = n-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
        return nums;
    }
    private void swap(int[] nums, int j, int k){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
}
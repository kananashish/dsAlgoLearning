class Solution {
    public int[] selectionSort(int[] nums) {
        //size of array
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int mini = i;
            for(int j = i; j < n; j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }
            swap(nums, i, mini);
        }
        return nums;
    }
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
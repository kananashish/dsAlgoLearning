class Solution {
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeSortHelper(nums, 0, n-1);
        return nums;
    }
    private void mergeSortHelper(int[] nums, int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSortHelper(nums,low,mid);
        mergeSortHelper(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    private void merge(int[] nums, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(nums[left]);
            left++;
        }
        while(right <= high){
            temp.add(nums[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            nums[i] = temp.get(i - low);
        }
    }
}
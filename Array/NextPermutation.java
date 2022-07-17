class Solution {
    public void nextPermutation(int[] nums) {
        // Find first decreasing element
        
        int i = nums.length - 2;
        
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Find the first element bigger than i and swap them
        
        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(i, j, nums);
        }
        // Reverse the array to the right from i
        
        reverse(i + 1, nums);
    }
    
    public void reverse(int start, int[] nums) {
        int i = start;
        int j = nums.length - 1;
        
        while(j > i) {
            swap(i, j, nums);
            i++;
            j--;
        }
    }
    
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

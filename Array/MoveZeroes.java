class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        
        for(int i = lastNonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }
    }
}

// Leetcode 152. Maximum Product Subarray
// https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        int res = nums[0], min = nums[0], max = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            int prevMax = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.min(Math.min(nums[i] * min, nums[i] * prevMax), nums[i]);
            res = Math.max(max, res);
        }
        
        return res;
    }
}
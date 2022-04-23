// Leetcode 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int globalMax = nums[0];
            
        for (int i = 1; i<nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            globalMax = Math.max(localMax, globalMax);
        }
        
        return globalMax;
    }
}

// Leetcode 55. Jump Game
// https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndex = nums.length - 1;
        
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] + i >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        
        return lastGoodIndex == 0;
    }
}

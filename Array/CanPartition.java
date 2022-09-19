class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        
        for(int num : nums) {
            sum += num;
        }
        
        if(sum % 2 == 1) return false;
        
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        
        int len = dp.length;
        
        for(int num : nums) {
            for(int i = len - 1; i - num >= 0; i--) {
                if(dp[i - num]) dp[i] = true;
            }
        }
        
        return dp[sum / 2];
    }
}

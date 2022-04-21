// Leetcode 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        
        while(right < prices.length) {
            if(prices[left] > prices[right]) {
                left = right;
            } else {
                max = Math.max(max, prices[right] - prices[left]);
            }
            
            right++;
        }
        
        return max;
    }
}

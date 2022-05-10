// Leetcode 11 Container with most water
// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(right > left) {
            int area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(area, result);
            
            if(height[right] > height[left]) left++;
            else right--;
        }
        
        return result;
    }
}

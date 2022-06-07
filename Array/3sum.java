// Leetcode 15. 3Sum
// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new LinkedList<>();
        Arrays.sort(nums);
        
        List<List<Integer>> res = new LinkedList<>();
        
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int target = 0 - nums[i];
                int low = i + 1;
                int high = nums.length - 1;
                
                while(high > low) {
                    int sum = nums[low] + nums[high];
                    
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(high > low && nums[low] == nums[low + 1]) low++;
                        while(high > low && nums[high] == nums[high - 1]) high--;
                        high--;
                        low++;
                    } 
                    else if(sum > target) high--;
                    else low++;
                }
            }
        }
        
        return res;
    } 
}

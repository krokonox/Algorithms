// Leetcode 39

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(combinations, new ArrayList<>(), target, candidates, 0);
        return combinations;
    }
    
    public void backtrack(List<List<Integer>> combinations, 
                          List<Integer> curr, 
                          int remain, 
                          int[] nums, 
                          int start) {
        if(remain < 0) return;
        else if(remain == 0) {
            combinations.add(new ArrayList<>(curr));
        }
        
        for(int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(combinations, curr, remain - nums[i], nums, i);
            curr.remove(curr.size() - 1);
        }
    }
}

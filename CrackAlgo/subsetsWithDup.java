class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), subsets, 0);
        
        return subsets;
    }
    
    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> subsets, int start) {
        subsets.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            
            curr.add(nums[i]);
            backtrack(nums, curr, subsets, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}

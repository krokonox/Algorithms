// Leetcode 78

class Solution {
    
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(nums, subsets, new ArrayList<>(), 0);
    return subsets;
  }
    
  public void backtrack(int[] nums, List<List<Integer>> subsets, List<Integer> curr, int start) {
      subsets.add(new ArrayList<>(curr));
      
      for(int i = start; i < nums.length; i++) {
          curr.add(nums[i]);
          backtrack(nums, subsets, curr, i + 1);
          curr.remove(curr.size() - 1);
      }
  }
    
}

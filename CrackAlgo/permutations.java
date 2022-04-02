class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        backtrack(permutations, new ArrayList<>(), nums);
     
        return permutations;
    }
    
    public void backtrack(List<List<Integer>> perms, List<Integer> tempList, int [] nums) {
        if(tempList.size() == nums.length) {
            perms.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++) {
               if(tempList.contains(nums[i])) continue;
               tempList.add(nums[i]);
               backtrack(perms, tempList, nums);
               tempList.remove(tempList.size() - 1);
            }
        }
    }
}

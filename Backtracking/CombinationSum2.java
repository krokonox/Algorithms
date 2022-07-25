// https://leetcode.com/problems/combination-sum-ii/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<Integer>(), result, 0);
        
        return result;
    }
    
    public void backtrack(int[] candidates, int target, List<Integer> curr, List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            
            int currElement = candidates[i];
            curr.add(candidates[i]);
            backtrack(candidates, target - currElement, curr, result, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}

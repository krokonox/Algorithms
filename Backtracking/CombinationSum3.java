// https://leetcode.com/problems/combination-sum-iii/

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        backtrack(new ArrayList<Integer>(), result, 1, n, k);
        return result;
    }
    
    public void backtrack(List<Integer> tempList, List<List<Integer>> result, int start, int target, int k) {
        if(tempList.size() > k) return;
        else if(tempList.size() == k && target == 0) result.add(new ArrayList<>(tempList));
        else {
            for(int i = start; i <= 9; i++) {
                tempList.add(i);
                backtrack(tempList, result, i + 1, target - i, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

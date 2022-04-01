class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        backtrack(combinations, new ArrayList<Integer>(), 1, n, k);
        
        return combinations;
    }
    
    public void backtrack(List<List<Integer>> combs, List<Integer> curr, int start, int n, int k) {
        if(k == 0) {
            combs.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int i = start; i <= n-k + 1; i++) {
            curr.add(i);
            backtrack(combs, curr, i+1, n, k - 1);
            curr.remove(curr.size() - 1);
        }
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        backtrack(n, new StringBuilder(), res, 0, 0);
        return res;
    }
    
    public void backtrack(int n, StringBuilder cur, List<String> res, int open, int close) {
        if(cur.length() == n * 2) {
            res.add(cur.toString());
            return;
        }
        
        if(open < n) {
            cur.append("(");
            backtrack(n, cur, res, open + 1, close);
            cur.deleteCharAt(cur.length() - 1);
        }
        
        if(open > close) {
            cur.append(")");
            backtrack(n, cur, res, open, close + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}

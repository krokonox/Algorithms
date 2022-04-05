// Leetcode 131

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> combs = new ArrayList<>();
        backtrack(s, 0, combs, new ArrayList<>());
        return combs;
    }
    
    public void backtrack(String s, 
                          int start, 
                          List<List<String>> combs, 
                          List<String> curr) {
        if(start >= s.length()) combs.add(new ArrayList<>(curr));
        
        for (int i = start; i < s.length(); i++) {
            if(isPalindrome(s, start, i)) {
                curr.add(s.substring(start, i + 1));
                backtrack(s, i + 1, combs, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    public boolean isPalindrome(String s, int start, int end) {
        while (end > start) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}

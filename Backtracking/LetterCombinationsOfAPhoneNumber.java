class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<String>();
        if(digits == null || digits.length() == 0) return result;
        combinations("", digits, 0, result);
        return result;
    }
    
    public void combinations(String curr, String digits, int currLength, List<String> result) {        
        if(currLength >= digits.length()) {
            result.add(curr);
            return;
        }
        
        String currentLetterPair = KEYS[(digits.charAt(currLength) - '0')];
        
        for(int i = 0; i < currentLetterPair.length(); i++) {
            combinations(curr + currentLetterPair.charAt(i), digits, currLength + 1, result);
        }
    } 
}

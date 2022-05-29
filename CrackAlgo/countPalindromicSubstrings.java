// Leetcode 647. Palindromic Substrings
// https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int countSubstrings(String s) {
        if(s == null || s == "") return 0;
        
        int res = 0;
        
        for(int i = 0; i < s.length(); i++) {
            res += countPalindromes(i, i, s);
            res += countPalindromes(i, i+1, s);
        }
        
        return res;
    }
    
    public int countPalindromes(int start, int end, String s) {
        int count = 0;
        
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            count++;
        }
        
        return count;
    }
}

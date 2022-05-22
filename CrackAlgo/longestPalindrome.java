// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 1 || s == null) return "";
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int odd = expand(s, i, i);
            int even = expand(s, i, i + 1);
            int maxLen = Math.max(odd, even);
            
            if(maxLen > end - start) {
                start = i - ((maxLen - 1) / 2);
                end = i + (maxLen / 2);
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int expand(String s, int left, int right) {
        if(s.length() < 1 || s == null) return 0;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}

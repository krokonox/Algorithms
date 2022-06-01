// Leetcode 424. Longest Repeating Character Replacement
// https://leetcode.com/problems/longest-repeating-character-replacement

class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] count = new int[26];
        int start = 0;
        int maxCharCount = 0;
        int res = 0;
        
        for(int end = 0; end < N; end++) {
            maxCharCount = Math.max(maxCharCount, ++count[s.charAt(end) - 'A']);
                
            while (end - start + 1 - maxCharCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            
            res = Math.max(res, end - start + 1);
        }
        
        return res;
    }
}
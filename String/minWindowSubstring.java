// Leetcode 76. Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];

        for (char ch : t.toCharArray()) count[ch]++;

        char[] sourceStr = s.toCharArray();
        String windowString = "";
        
        int windowLeft = 0, windowRight = 0;
        int charsFoundInWindow = 0;
        int totalCharsToFind = t.length();
        int minWindowLen = Integer.MAX_VALUE;

        while (windowRight < sourceStr.length) {
            int currentChar = sourceStr[windowRight];
            count[currentChar]--;

            if (count[currentChar] >= 0) {
                charsFoundInWindow++;
            }

            while (charsFoundInWindow == totalCharsToFind) {
                int currentWindowLen = windowRight - windowLeft + 1;

                if(minWindowLen > currentWindowLen) {
                    minWindowLen = currentWindowLen;
                    windowString = s.substring(windowLeft, windowRight + 1);
                }

                count[sourceStr[windowLeft]]++;
            
                if (count[sourceStr[windowLeft]] > 0) {
                    charsFoundInWindow--;
                }
                
                windowLeft++;
            }

            windowRight++;
        }
        
        return windowString;
    }
}

class Solution {
    public String reverseWords(String s) {
        char[] ca = s.toCharArray();

        for(int i = 0; i < ca.length; i++) {
            if(ca[i] != ' ') {
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; }
                reverse(ca, i, j);
                i = j;
            }
        }

        return new String(ca);
    }

    public void reverse(char[] s, int start, int end) {
        while (end > start) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}

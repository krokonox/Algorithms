class Solution {
    public void reverseString(char[] s) {
        swap(0, s.length - 1, s);
    }

    public void swap(int start, int end, char[] s) {
        while (end > start) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}

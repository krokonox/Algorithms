class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        String actualString = "";
        
        for(char chr : arr) {
            if(Character.isDigit(chr) || Character.isLetter(chr)) {
                actualString += chr;
            }
        }
        
        actualString = actualString.toLowerCase();
        
        int left = 0;
        int right = actualString.length() - 1;
        
        while(right >= left) {
            if(actualString.charAt(right) != actualString.charAt(left)) return false;
            left++;
            right--;
        }
        
        return true;
    }
}

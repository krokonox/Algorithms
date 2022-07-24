class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastSeen = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
        }
        
        for(int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            
            if(seen[curr]) continue;
        
            while(!stack.isEmpty() && curr < stack.peek() && lastSeen[stack.peek()] > i) {
                seen[stack.pop()] = false;
            }
            
            stack.push(curr);
            seen[curr] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()) {
             sb.append((char) (stack.pop() + 'a'));
        }
        
        return sb.reverse().toString();
    }
}

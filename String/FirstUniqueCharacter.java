class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int length = s.length();
        
        // Fill the hash map with char count
        
        for(int i = 0; i < length; i++) {
            char chr = s.charAt(i);
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }
        
        // Iterate through the array and find the first index
         
        for(int i = 0; i < length; i++) {
            char chr = s.charAt(i);
            if(map.get(chr) == 1) return i;
        }
        return -1;
    }
}

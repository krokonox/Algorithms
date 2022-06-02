// Leetcode 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList();
        Map<String, List<String>> map = new HashMap();
        
        for(String s : strs) {
            char[] count = new char[26];
            
            for (char ch : s.toCharArray()) { 
                count[ch - 'a']++;
            }
            
            String key = String.valueOf(count);
            
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}

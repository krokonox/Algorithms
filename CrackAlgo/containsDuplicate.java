// Leetcode 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean contDupl = false;
        
        for(int n: nums) {
            if(map.containsKey(n)) {
                contDupl = true;
                break;
            } 
            
            map.put(n, 1);
        }
        
        return contDupl;
    }
}

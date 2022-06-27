class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean contDuplicate = false;
        
        for(int num : nums) {
            if(map.containsKey(num)) {
                contDuplicate = true;
                break;
            }
            map.put(num, 1);
        }
        return contDuplicate;
    }
}

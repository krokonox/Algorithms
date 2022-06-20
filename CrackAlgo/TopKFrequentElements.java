class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        HashMap<Integer, List<Integer>> bucket = new HashMap();
        int[] result = new int[k];
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int val : map.keySet()) {
            int frequency = map.get(val);
            if(!bucket.containsKey(frequency)) {
                bucket.put(frequency, new ArrayList());
            }
            bucket.get(frequency).add(val);
        }
        
        for(int i = nums.length; i > 0; i--) {
            if(bucket.containsKey(i)) {
                List<Integer> arr = bucket.get(i);
                for(int val : arr) {
                    result[--k] = val;
                    if(k == 0) return result;
                }
            }
        }
         
        return result;
    }
}

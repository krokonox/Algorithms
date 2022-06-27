class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int firstPointer = 0;
        int secondPointer = 0;
        List<Integer> arr = new ArrayList<>();
        
        while(firstPointer < nums1.length && secondPointer < nums2.length) {
            if(nums1[firstPointer] == nums2[secondPointer]) {
                arr.add(nums1[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
            
            else if(nums1[firstPointer] > nums2[secondPointer]) {
                secondPointer++;
            }
            
            else if(nums2[secondPointer] > nums1[firstPointer]) {
                firstPointer++;
            }
        }
        
        int[] result = new int[arr.size()];
            
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        
        for(int elem : nums) {
            if(elem != val) {
                nums[k] = elem;
                k++;
            } 
        }
        
        return k;
    }
}

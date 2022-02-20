class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int middle = start + (end - start)/2;
            if(target == nums[middle]) return middle;
            else if(nums[middle] > target) end = middle;
            else start = middle + 1;
        }

        return nums[start] < target ? start + 1 : start;
    }
}

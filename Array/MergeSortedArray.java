class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftPointer = m - 1;
        int rightPointer = n - 1;
        int i = n + m - 1;
        
        while(rightPointer >= 0) {
            if(leftPointer >= 0 && nums1[leftPointer] > nums2[rightPointer]) {
                nums1[i--] = nums1[leftPointer--];
            } else {
                nums1[i--] = nums2[rightPointer--];
            }
        }
    }
}

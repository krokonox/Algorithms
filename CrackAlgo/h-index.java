class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;
        
        while (high > low) {
            int mid = low + (high - low + 1) / 2;
            
            if(isValid(citations, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    public boolean isValid(int[] citations, int h) {
        int count = 0;
        
        for(int i = 0; i < citations.length; i++) {
            if(citations[i] >= h) count++;
        }
        
        return count >= h;
    }
}

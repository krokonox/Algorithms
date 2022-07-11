class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        List<int[]> output_array = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] current_interval = intervals[0];
        output_array.add(current_interval);
        
        for(int[] interval : intervals) {
            int current_interval_end = current_interval[1];
            int next_interval_begin = interval[0];
            int next_interval_end = interval[1];
            
            if(current_interval_end >= next_interval_begin) {
                current_interval[1] = Math.max(current_interval_end, next_interval_end);
            } else {
                current_interval = interval;
                output_array.add(current_interval);
            }
        }
        
        return output_array.toArray(new int[output_array.size()][]);
    }
}

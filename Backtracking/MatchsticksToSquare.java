class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length < 4 || matchsticks == null) return false;
        
        int sum = 0;
        
        for(int stick : matchsticks) sum += stick;
        
        if(sum % 4 != 0) return false;
        
        int sideLength = sum / 4;
        
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        
        return backtrack(matchsticks, 0, new int[4], sideLength);
    }
    
    public boolean backtrack(int[] matchsticks, int index, int[] sums, int sideLength) {
        if(index == matchsticks.length) {
            if(sums[0] == sideLength && sums[1] == sideLength && sums[2] == sideLength) {
                return true;
            } else {
                return false;
            }
        }
        
        for(int i = 0; i < 4; i++) {
            if(sums[i] + matchsticks[index] > sideLength) continue;
            sums[i] += matchsticks[index];
            if (backtrack(matchsticks, index + 1, sums, sideLength)) return true;
    	    sums[i] -= matchsticks[index];
        }
        
        return false;
    }
    
    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(end > start) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}

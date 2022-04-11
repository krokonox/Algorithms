// Leetcode 994
// https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        Set<String> fresh = new HashSet<>();
        Set<String> rotten = new HashSet<>();
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    fresh.add("" + i + j);
                }
                if(grid[i][j] == 2) {
                    rotten.add("" + i + j);
                }
            }
        }
        
        int minutes = 0;
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        
        while(fresh.size() > 0) {
            Set<String> infected = new HashSet<>();
            
            for(String s: rotten) {
                int i = s.charAt(0) - '0';
                int j = s.charAt(1) - '0';
                
                for(int[] dir: directions) {
                    int nextI = dir[0] + i;
                    int nextJ = dir[1] + j;
                    
                    if(fresh.contains("" + nextI + nextJ)) {
                        fresh.remove("" + nextI + nextJ);
                        infected.add("" + nextI + nextJ);
                    }
                }
            }
            
            if(infected.size() == 0) {
                return -1;
            }
            
            rotten = infected;
            minutes++;
        }
        
        return minutes;
    }
}


class Solution {
    
    boolean seen[][];
    
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        seen = new boolean[rows][columns];
        
        for(int row = 0; row < rows; row++) {
            for(int column = 0; column < columns; column++) {
                max_area = Math.max(max_area, area(grid, row, column));
            }
        }
        
        return max_area;
    }
    
    public int area(int[][] grid, int row, int column) {
        if(row < 0 || column < 0 || 
           row >= grid.length || column >= grid[row].length ||
           grid[row][column] == 0 || seen[row][column]) return 0;
        
        seen[row][column] = true;
        
        return (1 + area(grid, row + 1, column) +
               area(grid, row - 1, column) + 
               area(grid, row, column + 1) +
               area(grid, row, column - 1));
    }
}

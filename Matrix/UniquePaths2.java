// Algorithm:
// 1. Set first cell to 1 if it's not an obstacle
// 2. Calculate the first row & column number of paths 
// 3. Fill each cell with number of paths based on the num of paths for the previous top & left cells

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        
        obstacleGrid[0][0] = 1;
        
        // Fill in the first row
        for(int i = 1; i < cols; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }
        
        // Fill in the first column
        for(int i = 1; i < rows; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i -1 ][0] == 1) ? 1 : 0;
        }
        
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if(obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        
        return obstacleGrid[rows - 1][cols - 1];
    }
}

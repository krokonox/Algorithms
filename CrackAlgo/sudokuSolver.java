class Solution {
    private static final int GRID_SIZE = 9;
    
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0) return;
        solve(board);
    }
    
    public boolean solve(char[][] board) {
        for(int row = 0; row < GRID_SIZE; row++) {
            for(int column = 0; column < board[0].length; column++) {
                if(board[row][column] == '.') {
                    for(char i = '1'; i <= '9'; i++) {
                        if(isNumberValid(board, row, column, i)) {
                            board[row][column] = i;
                            
                            if(solve(board)) {
                                return true;
                            } else {
                                board[row][column] = '.';
                            }
                        } 
                    }
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isNumberValid(char[][] board, int row, int column, char num) {
        return !isNumberInRow(board, row, num) &&
               !isNumberInColumn(board, column, num) &&
               !isNumberInGrid(board, row, column, num);
    }
    
    public boolean isNumberInRow(char[][] board, int row, char num) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if((board[row][i]) == num) {
                return true;
            } 
        }
        
        return false;
    } 
    
    public boolean isNumberInColumn(char[][] board, int column, char num) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if((board[i][column]) == num) {
                return true;
            } 
        }
        
        return false;
    } 
    
    public boolean isNumberInGrid(char[][] board, int row, int column, char num) {
        int boxRowNum = row - row % 3; // Left row corner
        int boxColumnNum = column - column % 3; // Top column corner
        
        for(int i = boxRowNum; i < boxRowNum + 3; i++) {
            for(int j = boxColumnNum; j < boxColumnNum + 3; j++) {
                if((board[i][j]) == num) {
                    return true;
                } 
            }
        }
        
        return false;
    } 
}

// Leetcode 79. Word Search
// https://leetcode.com/problems/word-search/

class Solution {
    static boolean [][] visited;
        
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || word.length() == 0) return false;
        
        visited = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(word.charAt(0) == board[i][j] && search(board, word, i, j, 0)) return true;
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, String word, int row, int col, int index) {
        if(word.length() == index) return true;
        if(row >= board.length || row < 0 || 
           col >= board[row].length || col < 0 || 
           board[row][col] != word.charAt(index) || visited[row][col]) return false;
        
        visited[row][col] = true;
        
        index++;
        
        if(search(board, word, row+1, col, index) ||
           search(board, word, row-1, col, index) || 
           search(board, word, row, col+1, index) ||
           search(board, word, row, col-1, index)
          ) { 
               return true;
           }
                  
        visited[row][col] = false;
        return false;
    }
}

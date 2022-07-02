class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int curValue = board[i][j];
                
                if(curValue != '.') {
                    if(!set.add(curValue + "row" + i) ||
                       !set.add(curValue + "column" + j) ||
                       !set.add(curValue + "box" + i / 3 + '-' + j/3))
                        return false;
                }
            }
        }
        
        return true;
    }
}

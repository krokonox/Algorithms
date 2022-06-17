class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        
        // First we transpose the matrix
        
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
        // Now we can flip the matrix horizontally 
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = tmp;
            }
        }
    }
}

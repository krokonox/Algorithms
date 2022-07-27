class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        int length = mat.length;
        for (int i = 0; i< length; i++) {
            result += mat[i][i];
            result += mat[length - 1 - i][i]; 
        }
        return length % 2 == 0 ? result : result - mat[length/2][length/2]; 
    }
}

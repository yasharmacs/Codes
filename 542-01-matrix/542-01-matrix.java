/*
1.row+col are just acting as max we use that is INT.MAX_VALUE;
2. 0,1,1,0 if we go from left to right then its o/p will be 0,1,2,0 but in right of 2 we have a zero so make such cases false we will do 2 loops .
1st loop from top left to bottom right and
2nd from bottom right to top right .
*/
class Solution {    
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) continue;
                mat[i][j] = row + col; // acting as int.max_value;
                if (i > 0) mat[i][j] = Math.min(mat[i][j], mat[i - 1][j] + 1);
                if (j > 0) mat[i][j] = Math.min(mat[i][j], mat[i][j - 1] + 1);
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                if (i < row - 1) mat[i][j] = Math.min(mat[i][j], mat[i + 1][j] + 1);
                if (j < col - 1) mat[i][j] = Math.min(mat[i][j], mat[i][j + 1] + 1);
            }
        }
        return mat;        
    }
}
class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int[][] ans=new int[matrix[0].length][matrix.length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 ans[j][i]= matrix[i][j];
//             }
//         }
//         return ans;
//     }
// }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] res = new int[col][row];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                res[j][i] = matrix[i][j];
            }
        }
        
        return res;
    }
}
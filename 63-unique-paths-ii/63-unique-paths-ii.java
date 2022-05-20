class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dpArray = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++) {
            for(int j = 0; j < obstacleGrid[0].length; j++) {            
                if (obstacleGrid[i][j] == 1) {
                    dpArray[i][j] = 0;
                } else {
                    int up = i - 1 < 0 ? 0 : dpArray[i - 1][j];
                    int left = j - 1 < 0 ? 0 : dpArray[i][j - 1];
                    dpArray[i][j] = i == 0 && j == 0 ? 1 : up + left;                    
                }
            }
        }
        return dpArray[dpArray.length - 1][dpArray[0].length - 1];
    }
}
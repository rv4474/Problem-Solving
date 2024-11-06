class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
          dp=new int[obstacleGrid.length][obstacleGrid[0].length];
          return  obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1?0:path(obstacleGrid,0,0);
    }
    public int path(int[][] obstacleGrid,int i,int j){
        if(i>obstacleGrid.length-1||j>obstacleGrid[0].length-1) return 0;
        if(i==obstacleGrid.length-1&&j==obstacleGrid[0].length-1) return 1;
        if(obstacleGrid[i][j]==1) {
          return dp[i][j]=0;
        }
        if(dp[i][j]!=0) return dp[i][j];
      int right=path(obstacleGrid,i+1,j);
      int down=path(obstacleGrid,i,j+1);
      return dp[i][j]=right+down;
    }
}
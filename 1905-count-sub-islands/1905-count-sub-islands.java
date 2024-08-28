class Solution {
    public void dfs(int[][] grid1, int[][] grid2,int i,int j,int[][] vis,int[] sub){
        vis[i][j]=1;
        if(grid1[i][j]==0){
            sub[0]=0;
             }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        for(int a=0;a<4;a++){
            int ro=i+dr[a];
            int co=j+dc[a];
            if(ro>=0&&ro<grid1.length&&co>=0&&co<grid1[0].length){
                if(vis[ro][co]==0&&grid2[ro][co]==1){
                    dfs(grid1,grid2,ro,co,vis,sub);
                }
            }
        }
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[][] vis = new int[grid2.length][grid2[0].length];
        int ans=0;
        int[] sub=new int[1];

        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                sub[0]=1;
                if(vis[i][j]==0&&grid2[i][j]==1){
                  dfs(grid1,grid2,i,j,vis,sub);
                  ans+=sub[0];
                }
            }
        }
    return ans;
    }
}
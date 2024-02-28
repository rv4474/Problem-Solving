package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class numberOfDistinctIsland {
    void dfs(int ro,int co,int[][] grid,int[][] vis,ArrayList<String> vec,int r,int c,int n,int m){
        vis[ro][co]=1;
        vec.add(Integer.toString(ro-r)+ " " +Integer.toString(co-c));
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        for(int i=0;i<4;i++){
            int row=ro+dr[i];
            int col=co+dc[i];
            if(row>=0&&row<n&&col>=0&&col<m&&vis[row][col]==0&&grid[row][col]==1){
                dfs(row,col,grid,vis,vec,r,c,n,m);
            }
        }
    }
    

    int countDistinctIslands(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        HashSet<ArrayList<String>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]==1){
                    ArrayList<String> vec=new ArrayList<>();
                    dfs(i,j,grid,vis,vec,i,j,n,m);
                    set.add(vec);
                }
            }
        }
        return set.size();
    }
}


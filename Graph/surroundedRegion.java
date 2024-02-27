package Graph;

public class surroundedRegion {
    public void dfs(int[][] vis,char a[][],int r,int c,int n,int m){
        vis[r][c]=1;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        for(int i=0;i<4;i++){
            int ro=r+dr[i];
            int co=c+dc[i];
            if(ro>=0&&ro<n&&co>=0&&co<m&&vis[ro][co]==0&&a[ro][co]=='O'){
                dfs(vis,a,ro,co,n,m);
            }
        }
    }
    public void solve(char[][] a) {
        int n=a.length;
        int m=a[0].length;
         int[][] vis=new int[n][m];
        for(int i=0;i<m;i++){
            if(vis[0][i]==0&&a[0][i]=='O'){
                dfs(vis,a,0,i,n,m);
            }
        }
        for(int i=0;i<m;i++){
            if(vis[n-1][i]==0&&a[n-1][i]=='O'){
                dfs(vis,a,n-1,i,n,m);
            }
        }
        for(int i=1;i<=(n-2);i++){
            if(vis[i][0]==0&&a[i][0]=='O'){
                dfs(vis,a,i,0,n,m);
            }
        }
        for(int i=1;i<=(n-2);i++){
            if(vis[i][m-1]==0&&a[i][m-1]=='O'){
                dfs(vis,a,i,m-1,n,m);
            }
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(a[i][j]=='O'&&vis[i][j]==0){
                    a[i][j]='X';
                }
            }
        }

    }
}

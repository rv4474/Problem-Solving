class Solution {
    int imin,imax,jmin,jmax;
    public void dfs(int[][] land,int[][] vis,int i,int j){
        vis[i][j]= 1;
        if(imin>i){
            imin=i;
        }
        if(jmin>j){
            jmin=j;
        }

        if(imax<i){
            imax=i;
        }
        if(jmax<j){
            jmax=j;
        }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        for(int a=0;a<4;a++){
            int ro=i+dr[a];
            int co=j+dc[a];
            if(ro>=0&&ro<land.length&&co>=0&&co<land[0].length){
                 if(vis[ro][co]==0&&land[ro][co]==1){
                    dfs(land,vis,ro,co);
                 }
            }
        }
        
    }
    public int[][] findFarmland(int[][] land) {
        imin=land.length;
        jmin=land[0].length;
        imax=-1;
        jmax=-1;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int[][] vis=new int[land.length][land[0].length];
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(vis[i][j]==0&&land[i][j]==1){
                    imin=land.length;
                    jmin=land[0].length;
                    imax=-1;
                    jmax=-1;
                   dfs(land,vis,i,j);
                   ArrayList<Integer> sub = new ArrayList<>();
                   sub.add(imin);
                   sub.add(jmin);
                   sub.add(imax);
                   sub.add(jmax);
                   arr.add(new ArrayList<>(sub));
                   sub.clear();
                }
            }
        }
        int[][] ans=new int[arr.size()][4];
        for(int i=0;i<arr.size();i++){
            ans[i][0]=arr.get(i).get(0);
            ans[i][1]=arr.get(i).get(1);
            ans[i][2]=arr.get(i).get(2);
            ans[i][3]=arr.get(i).get(3);
        }

        return ans;
    }
}
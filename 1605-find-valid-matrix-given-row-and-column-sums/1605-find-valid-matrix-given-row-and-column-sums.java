class Solution {
    public int[][] restoreMatrix(int[] rs, int[] cs) {
        int[][] ans=new int[rs.length][cs.length];
        for(int i=0;i<rs.length;i++)
        {
            for(int j=0;j<cs.length;j++){
                  int min=Math.min(rs[i],cs[j]);
                  ans[i][j]=min;
                  rs[i]-=min;
                  cs[j]-=min;
            }
        }
            return ans;
            }
}
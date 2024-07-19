class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
        int[] row=new int[m.length];
        int[] col=new int[m[0].length];
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                  min=Math.min(min,m[i][j]);
            }
            row[i]=min;
            min=Integer.MAX_VALUE;
        }
         for(int i=0;i<m[0].length;i++){
            for(int j=0;j<m.length;j++){
                  max=Math.max(max,m[j][i]);
            }
            col[i]=max;
            max=-1;
        }
         List<Integer> ans=new ArrayList<>();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                  if(m[i][j]==row[i]&&m[i][j]==col[j]){
                    ans.add(m[i][j]);
                  }
            }
           
        }
   return ans;
    }
}
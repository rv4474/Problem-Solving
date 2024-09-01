class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
      int[][] ans =new int[m][n];
       int[][] an =new int[0][0];
      if(m*n!=original.length) return an;
      for(int i=0;i<original.length;i++){
          ans[i/n][i%n]=original[i];  
      }
      return ans;
    }
}
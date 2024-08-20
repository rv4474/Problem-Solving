class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
         int minj=0,maxj=n-1;
        int mini=0,maxi=n-1;
        int count=(n)*(n),c=0;
        int k=1;
        while(c<count){
            for(int j=minj;(c<count)&&j<=maxj;j++){
                ans[mini][j]=k++; 
                c++;  
            }
             mini++;
              for(int i=mini;(c<count)&&i<=maxi;i++){
                ans[i][maxj]=k++;
                c++;     
            }
            maxj--;
            for(int j=maxj;(c<count)&&j>=minj;j--){
               ans[maxi][j]=k++; 
                c++;
            }
            maxi--;
              for(int i=maxi;(c<count)&&i>=mini;i--){
                ans[i][minj]=k++;  
                c++;
            }
            minj++;

    }
    return ans;
}
}
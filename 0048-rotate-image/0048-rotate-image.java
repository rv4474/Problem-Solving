class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int temp=0;
        for(int i=0;i<row-1;i++){
            for(int j=i;j<row;j++){
              temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            int p1=0,p2=row-1;
            while(p1<p2) {
                temp = 0;
                temp = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = temp;
                p1++;
                p2--;
            }
        }
    }
}


package DynamicProgramming;

public class minFallingPath11 {
    Integer[][] ans;
       public int minFallingPathSum(int[][] mt) {
           ans=new Integer[mt.length+1][mt[0].length];
           int m=Integer.MAX_VALUE;
           if(mt.length==1)
          { for(int i=0;i<mt[0].length;i++){
             m=Math.min(m,mt[0][i]);
           }
           return m;}
           for(int i=0;i<mt[0].length;i++){
               m=Math.min(m,helper(mt,0,i));
           }
           System.out.println(Integer.MAX_VALUE);
           return m;
       }
       public int helper(int[][] matrix,int i,int j){
           if((j<0||j>= matrix[0].length)&&i<matrix.length) return Integer.MAX_VALUE;
           if(i>=matrix.length||j<0||j>= matrix[0].length) return 0;
           if(ans[i][j]!=null) return ans[i][j];
           int q=Integer.MAX_VALUE;
           for(int a=0;a<matrix[0].length;a++){
               if(a!=j){
                   q=Math.min(q,matrix[i][j]+helper(matrix,i+1,a));
               }
           }
           return ans[i][j]=q;
           }
   
   }
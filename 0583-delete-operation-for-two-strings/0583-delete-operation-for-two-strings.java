class Solution {
    public int minDistance(String w1, String w2) {
         int[][] ans=new int[w1.length()+1][w2.length()+1];
        for(int i=0;i<w1.length()+1;i++){
            ans[i][0]=i;
        }
        for(int i=0;i<w2.length()+1;i++){
            ans[0][i]=i;
        }
        for(int i=1;i<w1.length()+1;i++){
            for(int j=1;j<w2.length()+1;j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)) 
                ans[i][j]=ans[i-1][j-1];
                else
                ans[i][j]=Math.min(1+ans[i-1][j],1+ans[i][j-1]); 
            }
        }
        return ans[w1.length()][w2.length()];
    }

    }
class Solution {
    public int minimumDeleteSum(String w1, String w2) {
        int[][] ans=new int[w1.length()+1][w2.length()+1];
        ans[0][0]=0;
        for(int i=1;i<w1.length();i++){
            ans[i][0]=ans[i-1][0]+w1.charAt(i-1); 
        }
    
        for(int i=1;i<w2.length();i++){
            ans[0][i]=ans[0][i-1]+w2.charAt(i-1);
        }

        for(int i=1;i<w1.length()+1;i++){
            for(int j=1;j<w2.length()+1;j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)) 
                ans[i][j]=ans[i-1][j-1];
                else
                ans[i][j]=Math.min(w1.charAt(i-1)+ans[i-1][j],w2.charAt(j-1)+ans[i][j-1]); 
            }
        }
        return ans[w1.length()][w2.length()];
    }
    }

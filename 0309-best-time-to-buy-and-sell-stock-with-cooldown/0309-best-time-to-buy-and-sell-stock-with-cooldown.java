class Solution {
    Integer[][] dp;
    public int stock(int[] p,int i,int st){
       if(i>=p.length){
           return 0;
       }
       if(dp[i][st]!=null) return dp[i][st];
       if(st==1001){
        return dp[i][st]=Math.max(stock(p,i+1,p[i]),stock(p,i+1,1001));
       }
       else{
          int f=0,s=0;
       if(st>p[i]){
           f=stock(p,i+1,st);
       }
       else{
           f=stock(p,i+1,st);
           s=p[i]-st+stock(p,i+2,1001);
       }
    return dp[i][st]=Math.max(s,f);
       }
       
    }
    public int maxProfit(int[] prices) {
        dp=new Integer[prices.length+2][1002];
        return stock(prices,0,1001);
    }
}
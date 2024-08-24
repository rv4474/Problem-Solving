class Solution {
    Integer[][][] dp;
    
    public int stock(int[] p, int i, boolean st,int k) {
        if (k==0||i == p.length) return 0;
        
        if (dp[i][st ? 1 : 0][k] != null) return dp[i][st ? 1 : 0][k];
        
        int next = stock(p, i + 1, st,k); 
        int bs;
        
        if (st) {
            bs = p[i] + stock(p, i + 1, false,k-1);
        } else {
            bs = -p[i] + stock(p, i + 1, true,k);
        }
        return dp[i][st ? 1 : 0][k] = Math.max(next, bs);
    }
    
    public int maxProfit(int k,int[] prices) {
        dp = new Integer[prices.length][2][k+1]; 
        return stock(prices, 0, false,k); 
    }
}

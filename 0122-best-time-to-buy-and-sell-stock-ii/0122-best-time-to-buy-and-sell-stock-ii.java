class Solution {
    Integer[][] dp;
    
    public int stock(int[] p, int i, boolean st) {
        if (i == p.length) return 0;
        
        if (dp[i][st ? 1 : 0] != null) return dp[i][st ? 1 : 0];
        
        int next = stock(p, i + 1, st); 
        int bs;
        
        if (st) {
            bs = p[i] + stock(p, i + 1, false);
        } else {
            bs = -p[i] + stock(p, i + 1, true);
        }
        return dp[i][st ? 1 : 0] = Math.max(next, bs);
    }
    
    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2]; 
        return stock(prices, 0, false); 
    }
}

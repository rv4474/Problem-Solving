class Solution {
    int N=0;
    public int helper(int n, int a){
        if(n==N) return 0;
        if(n>N) return 1000;
        return Math.min(n==a?1000:1+helper(n,n),1+helper(n+a,a));
    }
    public int minSteps(int n) { 
        N=n;
        if(n==1) return 0;
        return 1+helper(1,1);
    }
}
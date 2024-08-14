class Solution {
    Integer[][] dp;
    public int count(int[] nums,int i,int p1,int p2){
        if(i==nums.length) return 1; 
        long c=0;  
        if(dp[i][p1]!=null) return dp[i][p1]%1000000007;
        for(int v1=0;v1<=Math.min(nums[i],nums[nums.length-1]);v1++){
            int v2=nums[i]-v1; 
            if(v1>=p1 && v2<=p2){     
               c = (c%1000000007 + count(nums,i+1,v1,v2)%1000000007)%1000000007;   
            }
        }
        return dp[i][p1]=(int)c;
    }
    public int countOfPairs(int[] nums) {
       dp= new Integer[nums.length][nums[nums.length-1]+1];
        return count(nums,0,0,nums[0])%1000000007;
    }
}
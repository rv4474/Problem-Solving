class Solution {
    public int maxCoins(int[] nums) {
        int[] arr=new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=0;i<nums.length;i++){
            arr[i+1]=nums[i];
        }
        int[][] dp=new int[arr.length+1][arr.length+1];
              for(int i=nums.length;i>=1;i--){
                  for(int j=i;j<=nums.length;j++){
                        int ans=Integer.MIN_VALUE;
          for(int k=i;k<=j;k++){
           int  cost=dp[i][k-1]+arr[i-1]*arr[k]*arr[j+1]+dp[k+1][j]; 
           ans=Math.max(ans,cost);
        }
        dp[i][j]=ans;
              }
              }
        return dp[1][nums.length];
    }

}
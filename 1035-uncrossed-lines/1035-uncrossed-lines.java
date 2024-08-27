class Solution {
    public int uncross(int[] nums1, int[] nums2,int i,int j,Integer[][] dp){
        if(i==nums1.length||j==nums2.length) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(nums1[i]==nums2[j]){
            return dp[i][j]= Math.max(1+uncross(nums1,nums2,i+1,j+1,dp),Math.max(uncross(nums1,nums2,i+1,j+1,dp),Math.max(uncross(nums1,nums2,i,j+1,dp),uncross(nums1,nums2,i+1,j,dp))));
        }
        else{
            return dp[i][j]= Math.max(uncross(nums1,nums2,i+1,j+1,dp),Math.max(uncross(nums1,nums2,i,j+1,dp),uncross(nums1,nums2,i+1,j,dp)));
        }
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        Integer[][] dp=new Integer[nums1.length+1][nums2.length+1];
        return uncross(nums1,nums2,0,0,dp);
    }
}
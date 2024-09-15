class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] pre=new long[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           pre[i]=pre[i-1]+nums[i];
        }
        int ans=0;
        for(int i=0;i<(nums.length-1);i++){
             if(pre[i]>=(pre[nums.length-1]-pre[i])) ans++;
        }
        return ans;
    }
}
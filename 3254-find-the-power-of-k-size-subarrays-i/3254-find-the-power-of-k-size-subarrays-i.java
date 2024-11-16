class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        if(k==1){
            return nums;
        }
        int K=0;
        for(int i=0;i<=(nums.length-k);i++){
            int flag=0,max=nums[i];
            for(int j=0;j<(k-1);j++){
               if(nums[j+i]>=nums[i+j+1]||(nums[i+j+1]-nums[j+i])>1){
                    flag=1;
                    break;
               }
               if(max<nums[i+j+1]){
                max=nums[i+j+1];
               }
            }
            if(flag==0){
                ans[K++]=max;
            }
            else{
                ans[K++]=-1;
            }
        }
        return ans;
    }
}
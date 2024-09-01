class Solution {
    public void nextPermutation(int[] nums) {
        int temp=-1;
        int a=-1;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                     temp=nums[i];
                     nums[i]=nums[j];
                     nums[j]=temp;
                     a=j;
                     break;
                }
            }
           if(temp!=-1) break;
        }
        if(temp==-1){
           Arrays.sort(nums);
        }
        if(a!=-1){
            int j=0;
            int[] tarr=new int[nums.length-a-1];
            for(int i=a+1;i<nums.length;i++){
               tarr[j++]=nums[i];
        }
        Arrays.sort(tarr);
        j=0;
            for(int i=a+1;i<nums.length;i++){
               nums[i]=tarr[j++];
        }
        }

    }
}
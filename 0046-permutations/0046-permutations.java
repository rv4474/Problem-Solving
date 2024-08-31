class Solution {
   
    public void permu(int i,int[] nums,List<List<Integer>> ans){
        if(i==nums.length){
            List<Integer> an = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                an.add(nums[j]);
            }
            ans.add(new ArrayList<>(an));
            return ;
        }
        for(int ind=i;ind<nums.length;ind++){
            swap(i,ind,nums);
            permu(i+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int ind,int[] nums){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permu(0,nums,ans);
        return ans;
    }
}
class Solution {
    ArrayList<List<Integer>> an;
    public void permu(int[] nums,List<Integer> ans,int[] vis){
        if(ans.size()==nums.length){
            an.add(new ArrayList<>(ans));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]!=1){ 
                vis[i]=1;
                ans.add(nums[i]); 
                permu(nums,ans,vis);
                vis[i]=0;
                ans.remove(ans.size()-1); 
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        an=new ArrayList<>();
        int[] vis=new int[nums.length];
        permu(nums,new ArrayList<>(),vis);
        return an;
    }
}
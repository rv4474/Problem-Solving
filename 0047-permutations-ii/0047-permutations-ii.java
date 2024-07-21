class Solution {
    HashSet<List<Integer>> set;
    public void permu(int[] nums,List<List<Integer>> an,List<Integer> ans,boolean[] vis){
        if(ans.size()==nums.length){
            if(set.contains(ans)==false)
           {
            set.add(new ArrayList<>(ans));
            an.add(new ArrayList<>(ans));
            }
            return ;
        }
            for(int i=0;i<nums.length;i++){
                if(!vis[i]){
                    vis[i]=true;
                    ans.add(nums[i]);
                    permu(nums,an,ans,vis);
                    vis[i]=false;
                    ans.remove(ans.size()-1);
                }
            }
        
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> an=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        set=new HashSet<>();
        boolean[] vis=new boolean[nums.length];
        permu(nums,an,ans,vis);
        return an;
    }
}
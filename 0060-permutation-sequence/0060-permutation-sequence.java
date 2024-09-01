class Solution {
    int k;
    String res;
    ArrayList<List<Integer>> an;
    public void permu(int[] nums,List<Integer> ans,int[] vis){
        if(k==0) return ;
        if(ans.size()==nums.length){
        k--;
          if(k==0){
              for(int j=0;j<nums.length;j++){
                res=res+ans.get(j);
                    }       
            }
            an.add(new ArrayList<>(ans));
            System.out.println(ans);
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
    public String getPermutation(int n, int K) {
        int[] nums=new int[n];
        k=K;
        res="";
        for(int i=1;i<=n;i++){
            nums[i-1]=i;
        }
        an=new ArrayList<>();
        int[] vis=new int[nums.length];
        permu(nums,new ArrayList<>(),vis);
        return res;

    }
}
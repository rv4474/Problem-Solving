class Solution {
    List<List<Integer>> ans;
    public void combination(int i,int[] candidates, int target,List<Integer> sub) {  
        if(target==0){
              ans.add(new ArrayList<>(sub));
              return ;
        }
         for(int a=i;a<candidates.length;a++){
             if(a>i&&candidates[a]==candidates[a-1]){
                continue;
             }
             if(candidates[a]>target) break;
           sub.add(candidates[a]);
           combination(a+1,candidates,target-candidates[a],sub);
           sub.remove(sub.size()-1);
         }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,new ArrayList<>());
        return ans;
    }
}


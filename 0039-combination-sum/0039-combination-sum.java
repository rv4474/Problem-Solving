class Solution {
    List<List<Integer>> ans;
    public void combination(int i,int[] candidates, int target,List<Integer> sub) {  
        if(i<=candidates.length&&target==0){
              ans.add(new ArrayList<>(sub));
              return;
        }
        if(i==candidates.length||target<0){
           return ;
        }
        
        sub.add(candidates[i]);
        combination(i,candidates,target-candidates[i],sub);
        sub.remove(sub.size()-1);
        combination(i+1,candidates,target,sub);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
         combination(0,candidates,target,new ArrayList<>());
        return ans;
    }
}
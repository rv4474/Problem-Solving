class Solution {
    List<List<Integer>>  ans;

    public void helper(int i,List<Integer> sub,int[] arr){
        if(i==arr.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(arr[i]);
        helper(i+1,sub,arr);
        sub.remove(sub.size()-1);
        helper(i+1,sub,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans =new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        helper(0,sub,nums);
        return ans;
    }
}
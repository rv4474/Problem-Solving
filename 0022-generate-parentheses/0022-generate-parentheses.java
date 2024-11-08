class Solution {
    List<String> ans;
    public void gene(String s,int n,int m){
        if(n==0&&m==0){
            ans.add(s.substring(0));
            return;
        }
        if(n>0)
        gene(s+"(",n-1,m);
        if(m>n)
        gene(s+")",n,m-1);

    }
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        gene("",n,n);
        return ans;
    }
}
class Solution {
    Boolean memo [][];
    public boolean isMatch(String s, String p) {

        memo = new Boolean[s.length()+1][p.length()+1];
        return solve(s, p, 0, 0);

    }


    boolean solve(String s, String p, int i, int j){
        
        if(i == s.length() && j == p.length()) return true;

        if(i==s.length()&& j != p.length()) {
            for(int k=j;k<p.length();k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
            }

        if(i == s.length() || j == p.length()) return false;
        
        if(memo[i][j]!=null) return memo[i][j];
        boolean ans = false;
        
        if((s.charAt(i) == p.charAt(j)) || p.charAt(j) == '?'){
            ans = ans || solve(s, p,i+1, j+1);
        }
        else if(p.charAt(j) == '*'){
            ans = ans ||solve(s, p, i, j+1) || solve(s, p, i+1, j) || solve(s, p, i+1, j+1);
        }
        return memo[i][j]=ans;
    }
}
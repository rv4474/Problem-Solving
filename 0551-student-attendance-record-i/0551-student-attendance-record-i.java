class Solution {
    public boolean checkRecord(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                cnt++;
            }
            if(cnt>1) return false;
        }
        cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                cnt++;
                if(cnt==3) return false;
            }
            else{
                cnt=0;
            }
        }
        return true;
    }
}
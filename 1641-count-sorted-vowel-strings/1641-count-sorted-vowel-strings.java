class Solution {
    public int count(int i,int n,int c){
         if(c>n) return 0;
          if(c==n) return 1;
          int cnt=0;
          for(int a=i;a<=5;a++){
              cnt+=count(a,n,c+1);
          }
          return cnt;
    }
    public int countVowelStrings(int n) {
        return count(1,n,0);
    }
}
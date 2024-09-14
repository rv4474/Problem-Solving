class Solution {
    public int[] minOperations(String boxes) {
        int[] pre=new int[boxes.length()];
        int[] suf=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1')
            {    int k=1;
                for(int j=i+1;j<boxes.length();j++){
                 pre[j]+=k++;
        }
            }
        }

        for(int i=boxes.length()-1;i>=0;i--){
            if(boxes.charAt(i)=='1')
            {    int k=1;
                for(int j=i-1;j>=0;j--){
                 suf[j]+=k++;
        }
        }
        }
        int[] ans=new int[boxes.length()];
         for(int i=0;i<boxes.length();i++){
            ans[i]=pre[i]+suf[i];
         }
      return ans;
    }
}
class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
               str=str+Integer.toString((int)s.charAt(i)-96);
        }
        
        int sum=0;
        while(k!=0){
            sum=0;
             for(int i=0;i<str.length();i++){
                  sum+=(int)str.charAt(i)-48;
             }
             k--;
             str=Integer.toString(sum);
        }

        return sum;
            }
}
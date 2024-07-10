class Solution {
    public int minOperations(String[] logs) {
    int c=0;
        for(String s:logs){
            if(s.equals("./")){
                 continue;
            }
            if(s.equals("../")){
                if(c!=0){
                c--;
               }
            }
            else{
                c++;
                
            }
        }
        return c;
    }
}
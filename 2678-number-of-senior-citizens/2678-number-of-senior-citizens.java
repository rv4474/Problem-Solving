class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s : details){
            int a=Integer.parseInt(s.charAt(11)+"") *10+Integer.parseInt(s.charAt(12)+"") ;

            if(a>60) c++;
        }
         return c;
    }
}
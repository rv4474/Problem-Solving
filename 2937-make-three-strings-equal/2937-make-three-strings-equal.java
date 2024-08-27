class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n1=s1.length();
        int n2=s2.length();
        int n3=s3.length();
        int m=Math.min(n1,Math.min(n2,n3));
        int c=0;
        for(int i=0;i<m;i++){
            if(s1.charAt(i)==s2.charAt(i)&&s3.charAt(i)==s2.charAt(i)){
                c++;
            }
            else{
                break;
            }          
            }
             if(c==0) return -1;
            return n1-c+n2-c+n3-c;
        }
        
    }

class Solution {
    public int findTheWinner(int n, int k) {
       ArrayList<Integer> q=new ArrayList<Integer>();
       for(int i=1;i<=n;i++){
        q.add(i);
       }
       int a=0;
       while(q.size()!=1){
           int p=(a+k-1)%q.size();
           System.out.println(q.remove(p));
           a=p;
       }
     return q.get(0);
    }
}
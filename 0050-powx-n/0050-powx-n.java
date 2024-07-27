class Solution {
    public double myPow(double x, long n) {
        if(n<0) {
            x=1/x;
            n=(-1)*n;
        }
       if(n==0) return 1;
       double x1=myPow(x,n/2);
       double x2=x1*x1;
       if(n%2!=0)  x2=x*x2;
      return x2; 
    }
}
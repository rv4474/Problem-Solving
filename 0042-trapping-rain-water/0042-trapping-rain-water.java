class Solution {
    public int trap(int[] h) {
       int left=0,right=h.length-1;
       int leftMax=0,rightMax=0;
       int sum=0;
       while(left<=right){
        if(h[left]<=h[right]){
           if(h[left]>=leftMax) leftMax=h[left];
           else{
            sum=sum+leftMax-h[left];
           }
           left++;
        }
        else{
            if(h[right]>=rightMax) rightMax=h[right];
           else{
            sum=sum+rightMax-h[right];
           }
           right--;
        }
       }
        return sum;
    }
}
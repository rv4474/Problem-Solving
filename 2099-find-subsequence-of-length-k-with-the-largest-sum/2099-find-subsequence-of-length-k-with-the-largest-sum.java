class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
         for(int a:nums){
            pq.add(a);
         }
         int[] ans=new int[k];
         
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<k;i++){
           set.add(pq.poll());
         }
         int j=0;
         for(int i=0;i<nums.length;i++){
            if(j==k) break;
            if(set.contains(nums[i]))
            ans[j++]=nums[i];
         }
         return ans;
    }
}
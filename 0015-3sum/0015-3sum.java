class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        if(i==0 || nums[i]!=nums[i-1])
        {int j=i+1;
        int k=n-1;
        int target=-1*nums[i];
        while(j<k){
            
            if((nums[j]+nums[k])==target){
                List<Integer> sub=new ArrayList<>();
                sub.add(nums[i]);
                sub.add(nums[j]);
                sub.add(nums[k]);
                ans.add(new ArrayList<>(sub));
                while(j<k && nums[j]==nums[j+1]) j++;
                while(j<k && nums[k]==nums[k-1]) k--;  
                j++;
                k--;
            }
            else if(nums[j]+nums[k]<target){
                  j++;
            }
            else{
                  k--;
            }
        }}
       }
       return ans;
    }
}
class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
           if(nums[0]==0){
                nums[0]=-1;
            }
          for(int i=1;i<n;i++){ 
                if(nums[i]==0){
                    nums[i]+=-1;
                }
                nums[i]+=nums[i-1]; 
        }
        for(int j=0;j<n;j++){
            System.out.println(nums[j]);
        }
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int j=0;j<n;j++){
            if(map.containsKey(nums[j])){
                ans =Math.max(ans,j-map.get(nums[j]));
            }
            else{
             map.put(nums[j],j);
            }
        }
        return ans;
    }
}
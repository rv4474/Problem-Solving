class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int[] arr=new int[1000000+1];
            for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                arr[Math.abs(nums[i]-nums[j])]+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr[i];j++){
                k--;
                if(k==0) return i;
            }
        }
        return 0;
    }
}
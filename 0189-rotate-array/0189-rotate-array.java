class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
        int[] arr=new int[d];
        int j=0;
        for(int i=nums.length-d;i<nums.length;i++){
            arr[j++]=nums[i];
        }
        int i=0;
        for(i=(nums.length-d-1);i>=0;i--){
            nums[i+d]=nums[i];
        }
         for(i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}
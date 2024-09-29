class Solution {
    public int maxFrequencyElements(int[] nums) {
        int m=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           m=Math.max(m,map.get(nums[i]));
           set.add(nums[i]);
        }
        int k=0;
        for(int a:set){
            if(map.get(a)==m) k++;
        }
        return k*m;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int[] ans=new int[2];
        for(int i:nums){
            set.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        for(int a:set){
            if(map.get(a)==1){
                 ans[k++]=a;
                 if(k==2) return ans;
            }
        }
        return ans;
    }
}
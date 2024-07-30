class Solution {
  
    public String[] sortPeople(String[] h, int[] n) {
        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0;i<n.length;i++){
            map.put(n[i],h[i]);
        }
        String[] ans=new String[n.length];
        int j=n.length-1;
        for(Map.Entry<Integer,String> m : map.entrySet()){
             ans[j--]=m.getValue();
        }

        return ans;
    }
}
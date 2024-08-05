class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> set=new HashSet<>();
        HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        int i=-1;
        for(String s:arr){
           i++;
           set.add(s);
           if(map.containsKey(s)){
            map.get(s).add(i);
           }
           else{
            ArrayList<Integer> as=new ArrayList<>();
            as.add(i);
            map.put(s,as);
           }
        }
        HashMap<Integer,String> mp=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(String as:arr){
             if(map.get(as).size()==1){
                ar.add(map.get(as).get(0));
                mp.put(map.get(as).get(0),as);
             }
        }
        
        if(k>ar.size()) return "";
        Collections.sort(ar);

        return mp.get(ar.get(k-1));

    }
}
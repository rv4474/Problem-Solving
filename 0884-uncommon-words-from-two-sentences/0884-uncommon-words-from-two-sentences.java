class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        String s="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                set.add(s);
               map.put(s,map.getOrDefault(s,0)+1);
               s="";
               continue;
            }
            s=s+s1.charAt(i)+"";
        }
        map.put(s,map.getOrDefault(s,0)+1);
        set.add(s);
        s="";
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                set.add(s);
               map.put(s,map.getOrDefault(s,0)+1);
               s="";
               continue;
            }
            s=s+s2.charAt(i)+"";
        }
        map.put(s,map.getOrDefault(s,0)+1);
        set.add(s);
        for(var str:set){
          if(map.get(str)==1) ans.add(str);
        }
         String[] arr=new String[ans.size()];
         for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
         }
         return arr;
    }
}
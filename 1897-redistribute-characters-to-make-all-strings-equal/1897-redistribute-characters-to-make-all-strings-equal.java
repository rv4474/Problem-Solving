class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                set.add(words[i].charAt(j));
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);     
            }
        }
         for(char c:set){
            if(map.get(c)%words.length!=0) return false;
         }
         return true;
    }
}
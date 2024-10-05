class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="";
        for(int i=0;i<s.length();i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                while(map.get(order.charAt(i))!=0)
            { str=str+order.charAt(i);
             map.put(order.charAt(i),map.get(order.charAt(i))-1);}
            }
        }
        for(int i=0;i<s.length();i++){
             if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))>0){
             str=str+s.charAt(i);
             map.put(s.charAt(i),map.get(s.charAt(i))-1);
                 }
             
    }
        return str;
}
}
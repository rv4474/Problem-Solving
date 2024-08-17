class Solution {
    HashMap<Integer,Integer> map1;
    HashMap<Integer,Integer> map2;
    public int maxProfit(int[] prices) {
        map1=new  HashMap<>();
        map2=new  HashMap<>();
        return buy(prices,0);
    }
    public int buy(int[] p,int i){
    if(i==p.length-1) return 0;
    if(map1.containsKey(i)) return map1.get(i);
    map1.put(i, Math.max(buy(p,i+1),sell(p,i+1)-p[i]));
    return map1.get(i);
    }
    public int sell(int[] p,int i){
        if(i==p.length-1) return p[i];
        if(map2.containsKey(i)) return map2.get(i);
    map2.put(i, Math.max(sell(p,i+1),p[i]));
    return map2.get(i);
    }
}
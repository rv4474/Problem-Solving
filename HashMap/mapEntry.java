package HashMap;

import java.util.HashMap;
import java.util.Map;

public class mapEntry {
    //Leetcode 532
    public int findPairs(int[] nums, int k) {
        if(nums.length==1) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
            }
        if(k==0 && map.size()==1) return 1;
        int c=0,p=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
           if(map.containsKey(m.getKey()+k)) c++;
            if(m.getValue()>1) p++;
        }
        return k==0?p:c;
    }
}

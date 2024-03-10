package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class intersection  {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums1){
          set.add(i);
        }
        for(int j:nums2){
          set2.add(j);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int a:set){
            if(set2.contains(a)) arr.add(a);
        }
        int[] ans=new int[arr.size()];
        int p=0;
        for(int k:arr){
            ans[p++]=k;
        }
        return ans;
    }
}
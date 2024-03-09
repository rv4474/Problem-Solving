package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class commonValue  {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(-1);
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(-1);
        for(int i=0;i<nums1.length;i++){
            if(arr1.get(arr1.size()-1)!=nums1[i]) arr1.add(nums1[i]);
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(arr2.get(arr2.size()-1)!=nums2[i]) arr2.add(nums2[i]);
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        int i=1;
        for(i=1;i<arr1.size();i++){
            if(map2.containsKey(arr1.get(i)))
            return arr1.get(i);
        }
        return -1;
    }
}

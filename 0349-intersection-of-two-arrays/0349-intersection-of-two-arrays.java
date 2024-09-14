class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                if(ans.size()==0||ans.get(ans.size()-1)!=nums1[i])
                ans.add(nums1[i]);
                i++;
                j++;
            }
            }
        }
        int[] arr=new int[ans.size()];
        for(i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
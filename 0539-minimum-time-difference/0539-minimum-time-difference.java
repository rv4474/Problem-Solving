class Solution {
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(var s:timePoints){
            String str="";
            if(s.charAt(0)!='0')
            str=str+s.charAt(0)+"";
            str=str+s.charAt(1)+"";
            int num1=Integer.parseInt(str);
            String st="";
            if(s.charAt(3)!='0')
            st=st+s.charAt(3)+"";
            st=st+s.charAt(4)+"";
            int num2=Integer.parseInt(st);
           if(num1==0&&num2==0){
            num1=24*60;
           }
           else{
            num1=num1*60;
           }
           arr.add(num1+num2);
        }
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min=Math.min(Math.abs(arr.get(i-1)-arr.get(i)),min);
        }
        min=Math.min(min,Math.abs(arr.get(arr.size()-1)-(arr.get(0)+24*60)));
        return min;
    }
}
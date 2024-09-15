class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        int max=0;
        int k=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<logs.length;j++){
                if(logs[j][0]<=(i+1950)&&logs[j][1]>(i+1950)){
                    arr[i]+=1;
                }
            }
            if(arr[i]>max){
                max=arr[i];
                k=i;
            }
        }
        return k+1950;
    }
}
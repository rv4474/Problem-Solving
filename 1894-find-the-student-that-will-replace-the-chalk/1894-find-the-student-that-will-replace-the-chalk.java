class Solution {
    public int chalkReplacer(int[] chalk, long k) {
        long sum=0;
        for(int a:chalk){
            sum+=a;
        }
         k=k%sum;
        
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k){
                return i;
            }
            k=k-chalk[i];
        }
        return 0;
    }
}
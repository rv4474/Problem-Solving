class Solution {
    public int findComplement(int num) {
        int c=0;
        int n=num;
        while(num!=0){
            c++;
            num=num>>1;
        }
        c=1<<c;
        return n^(c-1);

    }
}
class Solution {
    public int maxDistance(List<List<Integer>> a) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((aa, bb) -> Integer.compare(bb[1], aa[1]));
        for(int i=0;i<a.size();i++){
            pq.offer(new int[]{i,a.get(i).get(a.get(i).size()-1)});
        }
        int m=Integer.MIN_VALUE;
        
        for(int i=0;i<a.size();i++){      
            int[] ar=pq.poll();
            if(ar[0]!=i){
                m=Math.max(Math.abs(a.get(i).get(0)-ar[1]),m);
            }
            else{
                int[] ar1=pq.poll();
                m=Math.max(Math.abs(a.get(i).get(0)-ar1[1]),m);
                pq.offer(new int[]{ar[0],ar[1]});
            }
        }
        return m;
    }
}
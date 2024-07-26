class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans=new int[deck.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        int b=0;
        while(!q.isEmpty()){
            int a=q.poll();
            ans[a]=deck[b++];
            if(q.isEmpty()==false) {
                int c=q.poll();
                q.add(c);
                //q.offer(c);
            }
        }
       return ans;
    }
}
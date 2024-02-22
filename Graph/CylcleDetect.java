package Graph;
import java.util.ArrayList;
public class CylcleDetect {
    // Function to detect cycle in an undirected graph.
    public boolean DFS(ArrayList<ArrayList<Integer>> adj,int node,int p,int[] vis){
        vis[node]=1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0){
               if(DFS(adj,it,node,vis)==true){
                   return true;
               }
            }
            else{
                if(it!=p){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(DFS(adj,i,-1,vis)) return true;
            }
        }
        return false;
    }
}


package Graph;
import java.util.*;
public class DFS {
           private static void DFS(int node,ArrayList<ArrayList<Integer>> a,int[] vis){
            vis[node]=1;
            for(Integer it:a.get(node)){
                if(vis[it]==0){
                    DFS(it,a,vis);
                }
            }
            
        }
        static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
            // code here
            ArrayList<ArrayList<Integer>> gp=new ArrayList<>();
            for(int i=0;i<v;i++){
                gp.add(new ArrayList<Integer>());
            }
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(adj.get(i).get(j)==1&&i!=j){
                        gp.get(i).add(j);
                        gp.get(j).add(i);
                    }
                }
            }
            int[] vis=new int[v];
            int c=0;
            for(int i=0;i<v;i++){
                if(vis[i]==0){
                    c++;
                    DFS(i,gp,vis);
                }
            }
            return c;
        }
}

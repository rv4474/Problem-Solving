/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        List<Integer> sans=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
           Node currNode=q.remove();
           if(currNode==null){
               ans.add(sans);
               sans=new ArrayList<>();
               if(q.isEmpty()) break;
               else{
                   q.add(null);
               }
           }
           else{
               sans.add(currNode.val);
               for(Node node:currNode.children){
                q.add(node);
               }
           }
        }
    return ans;
    }
}
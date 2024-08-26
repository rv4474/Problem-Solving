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
    List<Integer> ans;
    public void post(Node root){
        if(root!=null) {
        for(int i=0;i<root.children.size();i++){
            post(root.children.get(i));
        }
        ans.add(root.val);
        }
    }
    public List<Integer> postorder(Node root) {
       
        ans=new ArrayList<Integer>();
         post(root);
        return ans;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashSet<Integer> set;
    List<TreeNode> ans;
    public void postOrder(TreeNode root,TreeNode pre,int d){
        if(root!=null){
             postOrder(root.left,root,1);
             postOrder(root.right,root,0);
             if(set.contains(root.val)){
                if(d==-1){
                  if(root.left!=null)
                   ans.add(root.left);
                   if(root.right!=null)
                   ans.add(root.right);
                }
                if(d==1){
                    if(root.left!=null)
                   ans.add(root.left);
                   if(root.right!=null)
                   ans.add(root.right);
                   pre.left=null;
                }
                if(d==0){
                   if(root.left!=null)
                   ans.add(root.left);
                   if(root.right!=null)
                   ans.add(root.right);
                   pre.right=null;
                }
             }
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        set=new HashSet<>();
        ans=new ArrayList<>(); 
        for(int i:to_delete){
            set.add(i);
        }   
        postOrder(root,null,-1);
        if(set.contains(root.val)==false){
            ans.add(root);
        }
        return ans;
        }
}
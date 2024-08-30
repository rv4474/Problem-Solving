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
    public int dfs(TreeNode root,TreeNode par,TreeNode gpar){
        if(root==null) {
            return 0;
        }  
        int sum=0;
        if(gpar.val%2==0){
            sum=root.val;
        }
       return sum + dfs(root.left,root,par) + dfs(root.right,root,par);    
    }
    public int sumEvenGrandparent(TreeNode root) {
       return  dfs(root,new TreeNode(3),new TreeNode(5));
    }
}
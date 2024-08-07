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
    public int summ(TreeNode root,int a){
        if(root==null) return 0;
        if(root.left==null&&root.right==null&&a==1) return root.val;
        return summ(root.left,1)+summ(root.right,0);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return summ(root,-1);
    }
}
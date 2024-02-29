package Tree;

import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
        int val;
     TreeNode left;
     TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
public class EvenOdd {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root.val%2==0) return  false;
        int c=0;
        q.add(root);
        q.add(null);
        int prev=-1;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                c++;
                prev=-1;
               if(q.isEmpty()) {
                    break;
                   }
               else{
                 q.add(null);
               }
            }
            else{
                if(c%2==0){
                  if(curr.val%2==0) return false; 
                  else{
                      if(prev!=-1&&prev>=curr.val){
                         return false;
                      }
                  } 
                }
                if(c%2!=0){
                  if(curr.val%2!=0) return false; 
                  else{
                      if(prev!=-1&&prev<=curr.val){
                         return false;
                      }
                  } 
                }
                prev=curr.val;
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
            }
        }
        return true;
    }
}

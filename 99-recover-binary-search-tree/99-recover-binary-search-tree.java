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
        TreeNode pre=null,first=null,second=null;

    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        helper(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    
    public void helper(TreeNode root){
        if(root==null) return;
        
        helper(root.left);
        if(first==null && (pre == null || pre.val>=root.val)){
            first=pre;
        }
        if(first != null && pre.val>=root.val){
            second=root;
        }
           pre=root;
           helper(root.right);
    }
}
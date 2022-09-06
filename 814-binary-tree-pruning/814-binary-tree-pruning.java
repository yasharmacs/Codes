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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        return helper(root);
    }
    private TreeNode helper(TreeNode temp){
        if(temp==null) return temp;
        TreeNode left=helper(temp.left);
        TreeNode right=helper(temp.right);
        if(left == null) temp.left=null;
        
        if(right == null) temp.right=null;
        
        if(left == null && right == null && temp.val==0){
            temp=null;
            return temp;
        }
        return temp;
    }
}
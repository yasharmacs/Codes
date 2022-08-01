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
    public boolean isBalanced(TreeNode root) {
        //if(root==null) return true;
        TreeNode curr=root;
        int ans=helper(curr);
        return ans != -1;
    }
    private int helper(TreeNode cur){
        if(cur==null) return 0;
        int l=helper(cur.left);
        if(l== -1){
            return -1;
        }
        int r=helper(cur.right);
        if(r == -1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(r,l)+1;
    }
}
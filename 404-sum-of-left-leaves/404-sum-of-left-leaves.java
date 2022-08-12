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
    int count=0;
    public int sumOfLeftLeaves(TreeNode root) {
     helper(root,false);
        return count;
    }
    private void helper(TreeNode root,boolean isLeft){
        if(root== null) return ;
        if(root.left== null && root.right == null && isLeft==true){
           count+=root.val;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
}
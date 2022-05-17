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
    int first=Integer.MAX_VALUE;
        long second=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        
        findMin(root);
        helper(root);
        return second == Long.MAX_VALUE ? -1 : (int)second;
    }
    public void findMin(TreeNode root){
        if(root==null) return;
        first=Math.min(first,root.val);
        findMin(root.left);
    }
    public void helper(TreeNode node) {
        if (node == null) {
            return;
        }
        helper(node.left);
        if (node.val > first) {
            second = Math.min(second, node.val);
        }
        helper(node.right);
    }
}
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
    public void flatten(TreeNode root) {
        if(root == null) return;
        while(root != null){
            if(root.left != null){
                TreeNode leftC=root.left;
                TreeNode curr=root.left;
                while(curr.right !=null) curr=curr.right;
                curr.right=root.right;
                root.left=null;
                root.right=leftC;
            }
            root=root.right;
        }
    }
}
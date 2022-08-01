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
    ArrayList<Integer> al=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       //preOrder Traversal    Root R L
        
        TreeNode curr=root;
        helper(curr);
        return al;
    }
    private void helper(TreeNode node){
        if(node==null) return;
        al.add(node.val);
        helper(node.left);
        helper(node.right);
        
    }
    
}
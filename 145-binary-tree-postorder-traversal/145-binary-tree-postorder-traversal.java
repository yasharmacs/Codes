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
    public List<Integer> postorderTraversal(TreeNode root) {
        //postOrder -> left right root
        TreeNode curr=root;
        helper(curr);
        return al;
    }
    private void helper(TreeNode node){
        if(node==null) return;
        helper(node.left);
        helper(node.right);
        al.add(node.val);
    }
}
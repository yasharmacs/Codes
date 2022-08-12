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
    List<List<Integer>> fal=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return fal;
        helper(new ArrayList<Integer>(),root,targetSum);
        return fal;
    }
    private void helper(ArrayList<Integer> al,TreeNode root,int targetSum){
        if(root== null) return;
        al.add(root.val);
        if(root.left== null && root.right == null && targetSum == root.val){
            fal.add(new ArrayList<Integer>(al));
        }
        else{
            helper(al,root.left,targetSum-root.val);
            helper(al,root.right,targetSum-root.val);
        }
        al.remove(al.size()-1);
    }
}
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
    public List<String> binaryTreePaths(TreeNode root) {
        TreeNode temp=root;
        List<String> al = new ArrayList<>();
        helper(temp,al,"");
        return al;
    }
    public void helper(TreeNode temp, List<String> al,String construct){
        if(temp==null){
            return;
        }
        if(temp.left == null && temp.right == null){
            construct+=String.valueOf(temp.val);
            al.add(construct);
            return;
        }
        // if(temp.left==null){
        //     helper(temp.right,al,construct+temp.val);
        // }
        // else{
        //     helper(temp.left,al,construct+temp.val);
        // }
        construct+=String.valueOf(temp.val)+"->"; // jaisa jaisa neecha ja rha ha waise waise temp ki value add krte chalo.
        helper(temp.left,al,construct);
        helper(temp.right,al,construct);
    }
}
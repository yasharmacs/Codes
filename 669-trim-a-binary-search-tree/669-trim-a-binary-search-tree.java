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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        //3 cases ho sakte ha!
        //1 case jissmein root ki root.val<low
        //2 case jissmein root ki root.val>high
        //3 case jissmein roo.val lies b/w low & high.
        
        if(root == null){
            return null;
        }
        if(root.val>=low && root.val<=high){
            root.left=trimBST(root.left,low,high);
            root.right=trimBST(root.right,low,high);
            return root;
        }
        else if(root.val>high){
           root= trimBST(root.left,low,high);
        }
        else if(root.val<low){
           root= trimBST(root.right,low,high);
        }
        return root;
    }
}
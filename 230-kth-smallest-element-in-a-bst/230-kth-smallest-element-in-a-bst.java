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
    int c=0,s=0;
    public int kthSmallest(TreeNode root, int k) {
        task(root,k);
        return s;
    }
    void task(TreeNode root,int k){
        if(root == null){
            return;
        }
        task(root.left,k);
        c++;
        if(c==k){
            s=root.val;
        }
        task(root.right,k);
    }
}
/*
Mine approach:-
left tree ki size nikalo
right ki nikalo
agar k< l.height se iterate in left
and vice versa!
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
            ListNode temp=head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        int i=0;
        int[] nums=new int[count];
        while(head != null){
            nums[i]=head.val;
            head=head.next;
            i++;
        }
        return helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int[] nums, int left, int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode t=new TreeNode(nums[mid]);
        t.left=helper(nums,left,mid-1);
        t.right=helper(nums,mid+1,right);
        return t;
    }
}
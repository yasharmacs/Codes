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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr != null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
       
        
    }
}
//10-8-1-11
//sabse phele next pointer ko 10 se 8 leke ja
//then 10 or 8 ka link todd toh curr.next=usko barbar karna ha null ke mtlb pre ke
//ab pre =current ki value(last node)
//curr ko de de next ki value jo baat agge chale
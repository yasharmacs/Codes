/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
       Queue<Node> q=new LinkedList<>();
        if(root == null) return root;
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                Node curr=q.poll();
                // if(q.isEmpty() || len==1){
                //     curr.next=null;
                // }
                // else{
                if(i<len-1){
                    curr.next=q.peek();
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        
        }
       return root; 
    }
}


//Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    public int inOrderSuccessor(Node root, Node k) {
        // code here
        Node curr=root;
        Node successor=null;
        
        while(curr!=null && curr.data!=k.data)
        {
            if(k.data<curr.data)
            {
                successor=curr;
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
        
        if(curr==null)
            return -1;
        
        if(curr.right!=null)
        {
            successor=curr.right;
            while(successor.left!=null)
            {
                successor=successor.left;
            }
        }
        
        if(successor!=null)
            return successor.data;
            
        return -1;
    }
}
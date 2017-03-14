package Trees;

public class LCAInBinaryTree {
	
	
	public Node lca(Node head, Node n1, Node n2){
		
		if(head==null){
			return null;
		}
		if(head==n1 || head==n2){
			return head;
		}
		
		Node left = lca(head.left,n1,n2);
		Node right = lca(head.right, n1,n2);
		
		if(left!=null && right!=null){
			return head;
		}
		
			return left!=null?left:right;	
	
	}

}

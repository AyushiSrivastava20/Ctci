package Trees;

public class LCAInBst {
	
	public Node lca(Node head, int p, int n){
		
		if(head.data > Math.max(p, n)){
			return lca(head.left,p,n);
		}
		else if(head.data<Math.min(p, n)){
			return lca(head.right,p,n);
		}else{
			return head; 
		}
	}

}

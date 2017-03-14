package Trees;

public class InOrderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node insucc(Node head, Node p){
		
		if(p.right!=null){
			p=p.right;
			while(p.left!=null){
				p=p.left;
			}
			return p;
			
		}else{
			return succ(head,p.data);
		}
		
		
	}
	
	public Node succ(Node head, int data){
		if(head==null){
			return null;
		}
		if(head.data<data){
			return succ(head.right,data);
		}else{
			Node s = succ(head.left,data);
			return s==null ? head:s;
		}
		
	}

}

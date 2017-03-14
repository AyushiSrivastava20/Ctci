package Trees;

public class TernaryTree {
	
	public void insert(int value, Node root){
		Node newNode = Node.newNode(value);
 
		if(root == null){		//if tree is empty, add newNode as root
			root = newNode;
			return;
		}
 
		Node curr = root;
		Node parent = null;
 
		while(curr != null) {			//Traverse the tree till we find the correct location for newNode
			parent = curr;
 
			if(value < curr.data){
				curr = curr.left;		//move left if value is less than root
			}else if(value > curr.data){
				curr = curr.right;		//move right if value is greater than root
			}else{
				curr = curr.middle;		//move middle if value is equal to root
			}			
		}
 
		if (value < parent.data){		//Add newNode to its correct parent
			parent.left = newNode;		
		}else if (value > parent.data){
			parent.right = newNode;
		}else {
			parent.middle = newNode;
		}
	}

}

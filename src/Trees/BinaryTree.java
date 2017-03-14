package Trees;

import java.util.List;

public class BinaryTree {

	public Node addNode(int data, Node head) {

		Node temphead = head;
		Node n = Node.newNode(data);
		if (head == null) {
			head = n;
			return head;
		}
		Node prev = head;
		while (head != null) {
			prev = head;
			if (head.data < data) {
				head = head.right;
			} else {
				head = head.left;
			}
		}

		if (prev.data < data) {
			prev.right = n;
		} else {
			prev.left = n;
		}

		return temphead;

	}

	public int size(Node head) {

		if (head == null) {
			return 0;
		}
		int leftsize = size(head.left);
		int rightsize = size(head.right);
		return leftsize + rightsize + 1;
	}

	public int height(Node head) {

		if (head == null) {
			return 0;
		}
		int leftheight = size(head.left);
		int rightheight = size(head.right);
		return Math.max(leftheight, rightheight) + 1;
	}

	public Node search(int key, Node head) {
		if (head == null) {
			return null;
		}
		if (head.data == key) {
			return head;
		}

		else if (head.data < key) {
			return search(key, head.right);
		} else {
			return search(key, head.left);
		}

	}

	public boolean isBst(Node head) {

		return isBst(head, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public boolean isBst(Node head, int min, int max) {
		if(head==null){
			return true;
		}
		
		if(head.data<=min || head.data >=max){
			return false;
}
		
		return isBst(head.left,min,head.data) && 
				isBst(head.right , head.data,max);
		
		

	}
	
	public boolean rootleaf(Node head, int sum, List<Node> path){
		
		if(head==null){
			return false;
		}
		
		if(head.left==null && head.right==null){
			if(head.data == sum){
                path.add(head);
                return true;
            }else{
                return false;
            }
		}
		
		if(rootleaf(head.left,sum-head.data,path) ||rootleaf(head.right,sum-head.data,path) ){
			path.add(head);
			return true;
		}
		
		return false;
	}

}

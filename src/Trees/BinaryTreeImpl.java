package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		Node head=null;
		head = bt.addNode(10, head);
		head = bt.addNode(9, head);
		head = bt.addNode(11, head);
		head = bt.addNode(7, head);
		head = bt.addNode(5, head);
		head = bt.addNode(15, head);
		head = bt.addNode(17, head);
		System.out.println("Size of tree" + bt.size(head));
		System.out.println("height of tree" + bt.height(head));
		Node res = bt.search(5, head);
		System.out.println("search key" + res.data);
		if(bt.isBst(head)){
			System.out.println("Tree is valid");
		}
		else{
			System.out.println("Tree is not valid");
		}
		
		List<Node> result = new ArrayList<>();
		boolean r = bt.rootleaf(head, 31, result);
		if(r){
            result.forEach(node -> System.out.print(node.data + " "));
        }else{
            System.out.println("No path for sum " + 22); 
        }
		

	}

}

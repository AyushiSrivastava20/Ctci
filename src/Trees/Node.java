package Trees;

public class Node {
	
	Node left;
	Node right;
	Node middle;
	int data;
	
	public static Node newNode(int data){
        Node n = new Node();
        n.left = null;
        n.right = null;
        n.middle=null;
        n.data = data;
        return n;
    }

}

package linkedlist;

public class DoubleLinkImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoubleList ls = new DoubleList();
		
		System.out.println("Inserting at end");
		ls.insertEnd(5);
		ls.display();
		System.out.println("Inserting at start");
		ls.insertStart(2);
		ls.display();
		System.out.println("Inserting at start");
		ls.insertStart(1);
		ls.display();
		System.out.println("Inserting at 3nd position");
		ls.insertAtPos(3, 3);
		ls.display();
		System.out.println("Inserting at 4nd position");
		ls.insertAtPos(6,4);
		ls.display();
		System.out.println("deleteing at 2nd position");
		ls.deleteAtPos(2);
		ls.display();
		
	}

}

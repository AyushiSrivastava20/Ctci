package linkedlist;

public class SingleLinkedListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ls = new LinkedList();
		
		System.out.println("Inserting at end");
		ls.addElementAtStart(5);
		ls.display();
		System.out.println("Inserting at start");
		ls.addElementAtStart(2);
		ls.display();
		System.out.println("Inserting at start");
		ls.addElementAtStart(1);
		ls.display();
		System.out.println("Inserting at 3nd position");
		ls.addElementAtPosition(3, 3);
		ls.display();
		System.out.println("Inserting at 4nd position");
		ls.addElementAtPosition(6, 4);
		ls.display();
		System.out.println("deleteing at 2nd position");
		ls.deleteFromStart();
		ls.display();
		System.out.println("deleteing at 1nd position");
		ls.deleteFromStart();
		ls.display();

	}

}

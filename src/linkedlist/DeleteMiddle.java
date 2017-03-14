package linkedlist;

import java.util.Scanner;

public class DeleteMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String input = sc.next();

		LinkedList list = new LinkedList();
		for (char i : input.toCharArray()) {
			list.addElementAtEnd(new Character(i));
		}
		
		Node first= list.getFirst();
		deleteSpecific(first.getNext().getNext());
		list.display();

	}

	private static void deleteSpecific(Node n) {
		// TODO Auto-generated method stub
		
		if(n==null){
			System.out.println("Invalid Node");
		}
		else{
			n.setData(n.getNext().getData());
			n.setNext(n.getNext().getNext());
		}
		
		
	}

}

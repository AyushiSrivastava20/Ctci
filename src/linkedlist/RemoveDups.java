package linkedlist;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be converted into char linked list");
		String s = sc.next();
		
		LinkedList ls = new LinkedList();
        for(char c : s.toCharArray()){
        	ls.addElementAtStart(new Character(c));
        	
        }
        
        removeDupsWithBuffer(ls).display();

	}
	
	public static LinkedList removeDupsWithBuffer(LinkedList list) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		Node current = list.getFirst();
		Node previous = null;
		
		while(current!=null){
			if(set.contains(current.getData())){
				previous.setNext(current.getNext());
			}
			else{
				set.add(current.getData());
				previous=current;
			}
			current=current.getNext();
		}
		
		return list;
	}

}

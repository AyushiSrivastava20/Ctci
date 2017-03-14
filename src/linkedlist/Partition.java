package linkedlist;

import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of linkedlist");
		int size=sc.nextInt();
		LinkedList ls = new LinkedList();
		System.out.println("enter  linkedlist");
		for(int i=0;i<size;i++){
			ls.addElementAtStart(sc.nextInt());
		}
        
		System.out.println("Enter partition element : ");
		Node partitionNode = new Node(sc.nextInt());
		ls = partitionStable(ls, partitionNode);

		ls.display();

		sc.close();
	}

	private static LinkedList partitionStable(LinkedList ls, Node partitionNode) {
		// TODO Auto-generated method stub
		LinkedList partitionedList = new LinkedList();
		LinkedList beforeList = new LinkedList();
		LinkedList afterList = new LinkedList();
		
		Node current = ls.getFirst();
		
		while(current!=null){
			
			if((int) current.getData() < (int) partitionNode.getData()){
				beforeList.addElementAtEnd(current.getData());
			}
			else if((int) current.getData() > (int) partitionNode.getData()){
				afterList.addElementAtEnd(current.getData());
			}else{
				afterList.addElementAtStart(current.getData());
			}
			current = current.getNext();
		}
		
		
		if(beforeList.getLast()==null) {
			partitionedList = afterList;
		} else { 
			beforeList.getLast().setNext(afterList.getFirst());
			partitionedList = beforeList;
		}
		
		return partitionedList;
	}
	
	

}

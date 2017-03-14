package StackQueue;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q1 = new Queue(5);
		q1.insert(2);
		q1.display();
		
		q1.insert(3);
		q1.insert(4);
		q1.display();
		q1.remove();
		q1.display();

	}

}

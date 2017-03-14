package StackQueue;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks s1 = new Stacks(5);
		s1.display();
		s1.push(4);
		s1.display();
		s1.isEmpty();
		s1.push(1);
		s1.push(2);
		s1.display();
		s1.pop();
		s1.display();

	}

}

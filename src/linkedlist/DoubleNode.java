package linkedlist;

public class DoubleNode {
	
	int data;
	DoubleNode prev, next;
	
	public DoubleNode(){
		data=0;
		prev=null;
		next=null;
		
	}
	
	public DoubleNode(int val, DoubleNode n, DoubleNode p){
		data=val;
		prev=p;
		next=n;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
	
	
	

}

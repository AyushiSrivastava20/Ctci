package linkedlist;

public class DoubleList {

	DoubleNode start;
	DoubleNode end;
	int size;
	
	public DoubleList(){
		start=null;
		end=null;
		size=0;
		
	}
	
	public boolean isEmpty(){
		return start==null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertStart(int val){
		
		DoubleNode n = new DoubleNode(val,null,null);
		if(start==null){
			start=n;
			end=start;
		}
		else{
			start.setPrev(n);
			n.setNext(start);
			start=n;
		}
		size++;
	}
	
	public void insertEnd(int val){
		
		DoubleNode n = new DoubleNode(val,null,null);
		if(start==null){
			start=n;
			end=start;
		}
		else{
			end.setNext(n);
			n.setPrev(end);
			end=n;
		}
		size++;
		
	}
	
	public void insertAtPos(int val, int pos){
		
		DoubleNode n = new DoubleNode(val,null,null);
		if(pos==1){
			insertStart(val);
			return;
		}
		DoubleNode ptr=start;
		for(int i=2; i<=size;i++){
			if(i==pos){
				DoubleNode temp = ptr.getNext();
				ptr.setNext(n);
				n.setPrev(ptr);
				n.setNext(temp);
				temp.setPrev(n);
				
				
			}
			
			ptr.getNext();
		}
		
		size++;
		
	}
	
	public void deleteAtPos(int pos){
		
		if(pos==1){
			
			if(size==1){
				start=null;
				end=null;
				size=0;
				return;
			}
			
			start=start.getNext();
			start.setPrev(null);
			size--;
			return;
			
		}
		if(pos==size){
			end = end.getPrev();
			end.setNext(null);
			size--;
		}
		
		DoubleNode ptr = start.getNext();
		for(int i =2;i<=size;i++){
			if(i==pos){
				DoubleNode p=ptr.getPrev();
				DoubleNode n =ptr.getNext();
				p.setNext(n);
				n.setPrev(p);
				size--;
				return;
				
			}
			
			ptr=ptr.getNext();
		}
		
	}
	
	 public void display()
	    {
	        System.out.print("\nDoubly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getNext() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        DoubleNode ptr = start;
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getNext();
	        while (ptr.getNext() != null)
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getNext();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
	
	
}

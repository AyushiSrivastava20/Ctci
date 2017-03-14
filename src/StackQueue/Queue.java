package StackQueue;

import java.util.NoSuchElementException;

public class Queue {
	
	int arr[];
	int len, size, front, rear;
	
	public  Queue(int n){
		
		size=n;
		arr = new int[size];
		front=-1;
		rear=-1;
		len=0;
		
	}
	
	public boolean isEmpty(){
		return front==-1;
	}
	
	public boolean isFull(){
		return (front==0 && rear==size-1);
	}
	
	public int peek(){
		if (isEmpty())
	           throw new NoSuchElementException("Underflow Exception");
		return arr[front];
	}
	
	public void insert(int i){
		
		if(rear==-1){
			front=0;
			rear=0;
			arr[rear]=i;
			
			
		}
		
		else if(rear+1 >=size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear+1<size){
			arr[++rear]=i;
		}
		len++;
		
	}
	
	public int remove() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
            len-- ;
            int ele = arr[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
	
	public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i]+" ");
        System.out.println();        
    }


}

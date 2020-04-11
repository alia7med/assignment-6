package classes;

import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

public class linkedListBasedQueue implements ILinkedBased,IQueue{
	
	private class Node {
	    private Object data ;
		private Node next ;
		public Node (Object data,Node next)
		{
			this.setData(data) ;
			this.setNext(next) ;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node f ; //the first node in the queue.
	private Node r ; //the last  node in the queue.
	private int size=0 ;
	
	public void enqueue(Object item) {
		Node node =new Node (item,null);
		if(isEmpty())
			f = node ; 
		else
			r.setNext(node) ;
		
		r = node ;
		size++;
	}

	public Object dequeue() {
		if(isEmpty())
			throw new RuntimeException("The queue is empty.");
		Object data = f.getData();
		f = f.getNext();
		size--;
		return data;
	}

	public boolean isEmpty() {
		
		return (size==0) ;
	}

	public int size() {	
		
		return this.size;
	}
}
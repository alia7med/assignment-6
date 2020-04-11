package classes;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

public class arrayBasedQueue implements IArrayBased,IQueue{
 private int f,r,size;
 private int N;
 Object[] Q;
  public arrayBasedQueue(int limit) {
	 this.N=limit;
	 this.f=0;
	 this.r=0;
	 this.size=0;
	 this.Q=new Object[N];
  }

	public void enqueue(Object item) {
		if (size()== N ) {
			throw new RuntimeException("The queue is full.");}
				
				Q[r] = item;
				r=(r+1)%N;
				size++;
	}
	
	public Object dequeue() {
		if (isEmpty()) {
		throw new RuntimeException("The queue is empty.");}
		Object Temp =Q[f];
		f= (f + 1) % N;
		size--;
		return Temp;

	}
	public boolean isEmpty() {
		return (size==0) ;
	}
	public int size() {
		return this.size;
	}
}

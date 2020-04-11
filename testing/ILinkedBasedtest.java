package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.linkedListBasedQueue;
import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;

class ILinkedBasedtest {

	@Test
	void test() {
		ILinkedBased obj = new linkedListBasedQueue() ;
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(10);
		assertEquals(5,obj.dequeue());
		assertEquals(2,obj.size());
		assertEquals(6,obj.dequeue());
		assertEquals(10,obj.dequeue());
		Assertions.assertThrows(RuntimeException.class, () -> {
			  obj.dequeue();
		  }); 
		assertEquals(0,obj.size());
		assertEquals(true,obj.isEmpty());
		obj.enqueue("aaa");
		obj.enqueue("bbb");
		assertEquals(2,obj.size());
		assertEquals(false,obj.isEmpty());
		assertEquals("aaa",obj.dequeue());
		assertEquals("bbb",obj.dequeue());
	}
}

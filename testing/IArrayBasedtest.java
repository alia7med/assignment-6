package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.arrayBasedQueue;

class IArrayBasedtest {

	@Test
	void test() {
		arrayBasedQueue obj=new arrayBasedQueue(3);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(10);
		Assertions.assertThrows(RuntimeException.class, () -> {
			  obj.enqueue(20);
		  }); 
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

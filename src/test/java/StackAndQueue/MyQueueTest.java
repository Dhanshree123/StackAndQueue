package StackAndQueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumbersShouldCreateQueue() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);

		INode myNode = myQueue.peek();

		myQueue.printQueue();

		assertEquals(myFirstNode, myNode);

	}

}

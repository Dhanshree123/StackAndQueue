package StackAndQueue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);

		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		INode myNode = myStack.peek();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}

	@Test
	public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);

		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		INode peek = myStack.peek();
		INode pop = myStack.pop();

		while (!(myStack.isEmpty())) {
			peek = myStack.peek();
			pop = myStack.pop();
		}
		Assert.assertEquals(peek, pop);
	}
}

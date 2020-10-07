package StackAndQueue;

public class MyQueue {

	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);

	}

	public INode peek() {
		return myLinkedList.head;
	}

	public void printQueue() {
		myLinkedList.printMyNodes();

	}

}

package com.learn.ds.linkedlist;

public class Application {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.setHead(new Node(12));
		sll.insertAtEnd(13);
		sll.insertAtEnd(14);
		sll.insertAtStart(11);
		sll.insertAtStart(10);
		sll.display();
		sll.valueAtNthNode(2);
		sll.midElement();
		sll.display();
		sll.reverse();
		sll.display();
		sll.recursiveReverse();
		sll.display();

	}

}

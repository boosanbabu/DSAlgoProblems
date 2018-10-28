package com.learn.ds.linkedlist;

public class DoublyLLNode {

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLLNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLLNode prev) {
		this.prev = prev;
	}

	public DoublyLLNode getNext() {
		return next;
	}

	public void setNext(DoublyLLNode next) {
		this.next = next;
	}

	int data;
	DoublyLLNode prev;
	DoublyLLNode next;
	
	public DoublyLLNode(int d) {
		data = d;
		prev = null;
		next = null;
	}

}

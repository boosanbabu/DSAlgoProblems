package com.learn.ds.linkedlist;

public class Node {

	private int data;
	private Node next;
	
	public Node(int d)
	{
		data = d;
		next = null;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public void setNext(int d)
	{
		next = new Node(d);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

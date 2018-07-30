package com.learn.ds.linkedlist;

import java.util.Stack;

public class SinglyLinkedList {
	
	Node head;
	
	public SinglyLinkedList(String wholeList)
	{
		createLL(wholeList);
	}
	
	public SinglyLinkedList()
	{
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		System.out.println("Setting Head to " + head.getData() + " . . . ");
		this.head = head;
	}
	
	public void insertAtEnd(int data)
	{
		System.out.print("Trying to insert "+ data + " at End . . . " );
		
		if(isEmpty())
		{
			setHead(new Node(data));
			return;
		}
		Node ptr = head;
		while(ptr.getNext()!=null)
		{
			ptr = ptr.getNext();
		}
		ptr.setNext(new Node(data));
		System.out.println("Inserted!!\n");
	}
	
	public void insertAtStart(int data)
	{
		System.out.print("Trying to insert "+ data + " at Start . . . " );
		Node n = new Node(data);
		if(isEmpty())
		{
			setHead(n);
			return;
		}
		
		n.setNext(head);
		setHead(n);
		System.out.println("Succesfully Inserted!\n");
	}
	
	public void display()
	{
		if(isEmpty())
		{
			return;
		}
		Node ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getNext();
		}
		System.out.println("\n");
	}
	
	public void valueAtNthNode(int n){
		if(isEmpty()){
			return;
		}
		if(n<0)
		{
			System.err.println("Invalid value for n");
			return;
		}
		int c = 0;
		Node ptr = head;
		while(c<=n && ptr!=null)
		{
			if(c==n)
			{
				System.out.println("Value at index [" + n + "] is " + ptr.getData() + "\n");
				return;
			}
			c++;
			ptr = ptr.getNext();
		}
		
		System.out.println("Couldn't get nth Node!");
		
	}
	
	public int size()
	{
		if(isEmpty())
		{
			return -1;
		}
		Node ptr = head;
		int c = 0;
		while(ptr!=null)
		{
			c++;
		}
		return c;
	}
	
	public void midElement()
	{
		if(isEmpty())
		{
			return;
		}
		Node fast;
		Node slow = fast = head;
		while(fast!=null && fast.getNext()!=null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		System.out.println("Mid element is " + slow.getData());;
	
	}
	
	
	public boolean isEmpty()
	{
		if(head==null)
		{
			System.out.println("Empty List!");
			return true;
		}
		return false;
	}

	public void createLL(String wholeList) {
		if(wholeList==null || wholeList.isEmpty())
		{
			System.err.println("Did not create LinkedList");
		}
		String[] elements = wholeList.split("->");
		for(String e:elements)
		{
			insertAtEnd(Integer.parseInt(e));
		}
		
	}
	
	public void reverse()
	{
		if(isEmpty() || head.getNext()==null)
		{
			return;
		}
		Node prev = null, curr = head, next = null;
		
		do{
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}while(curr!=null);
	
		head = prev;
	}
	
	public void recursiveReverse()
	{
		recursiveReverse(head);
	}

	private void recursiveReverse(Node ptr) {
		if(ptr==null)
			return;
		if(ptr.getNext()==null){
			head = ptr;
			return;
		}
			
		recursiveReverse(ptr.getNext());
		ptr.getNext().setNext(ptr);
		ptr.setNext(null);
		
	}

}

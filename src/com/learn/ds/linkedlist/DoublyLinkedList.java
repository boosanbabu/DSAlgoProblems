package com.learn.ds.linkedlist;

public class DoublyLinkedList {
	
	DoublyLLNode head;
	
	
	public void reverse(){
		head = reverse(head);
	}
	
	public DoublyLLNode reverse(DoublyLLNode head){
		if(head==null)
			return head;
		
		DoublyLLNode next = head.next;
		DoublyLLNode curr = head;
		DoublyLLNode prev = null;
		
		while(curr!=null){
			curr.prev = next;
			curr.next = prev;
			prev = curr;
			curr = next;
			if(next!=null)
				next = next.next;
		}
		
		return prev;
	}
	
	public void insertAtEnd(int d){
	
		if(head==null){
			head = new DoublyLLNode(d);
			return;
		}
		DoublyLLNode curr = head;
		while(curr.next!=null){
			curr = curr.next;
		}
		DoublyLLNode newNode = new DoublyLLNode(d);
		newNode.prev = curr;
		curr.next = newNode;	
	}
	
	public void display(){
		if(head==null){
			System.out.println("Empty!");
			return;
		}
		DoublyLLNode curr = head;
		while(curr!=null){
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		
	}
}

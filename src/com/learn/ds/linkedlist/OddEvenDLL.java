package com.learn.ds.linkedlist;
/*
 * Split into 2 LL with odd valued elements and even value elements 
 * without creating new node
 */
public class OddEvenDLL {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtEnd(4);
		dll.insertAtEnd(5);
		dll.insertAtEnd(7);
		dll.insertAtEnd(6);
		dll.insertAtEnd(9);
		dll.insertAtEnd(19);
		dll.insertAtEnd(16);
		dll.insertAtEnd(18);
		
		dll.display();
		DoublyLLNode[] res = splitEvenOdd(dll.head);
	}
	
	public static DoublyLLNode[] splitEvenOdd(DoublyLLNode head){
		DoublyLLNode oddHead = null, evenHead = null, 
				evenRunner = null, oddRunner = null;
		
		DoublyLLNode runner = head, nextRunner = null;
		
		while(runner!=null){
			nextRunner = runner.getNext();
			runner.setPrev(null);
			
			if(runner.getData()%2==0){
				if(evenHead==null){
					evenHead = runner;
				}
				else{
					runner.setPrev(evenRunner);
					evenRunner.setNext(runner);
				}
				evenRunner = runner;
				evenRunner.setNext(null);
			}
			else{
				if(oddHead==null){
					oddHead = runner;
				}
				else{
					runner.setPrev(oddRunner);
					oddRunner.setNext(runner);
				}
				oddRunner = runner;
				oddRunner.setNext(null);
			}
			runner = nextRunner;
		}
		return new DoublyLLNode[]{evenHead,oddHead};	
	}

}

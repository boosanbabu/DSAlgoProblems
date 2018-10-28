package com.learn.ds.linkedlist;

import java.util.Date;

public class Application {

    public static void main(String []args){
        
    	DoublyLLNode n = new DoublyLLNode(2);
    	
    	DoublyLinkedList dll = new DoublyLinkedList();
    	dll.head = n;
    	
    	dll.insertAtEnd(3);
    	dll.insertAtEnd(4);
    	dll.insertAtEnd(5);
    	dll.insertAtEnd(6);
    	
    	dll.display();
    	
    	dll.reverse();
    	System.out.println();
    	dll.display();
    }
	


}

package com.learn.ds.linkedlist;

public class DelDuplicates {

	public static void main(String[] args) {
		String formattedDOB = "01011988";
		String date = formattedDOB.substring(0, 2);
		String month = formattedDOB.substring(2, 4);
		String year = formattedDOB.substring(4, 8);
		
		System.out.println(year + month + date);

	}
	
	public static Node deleteDuplicates(SinglyLinkedList ll){
		Node h = ll.getHead();
		if(h==null){
			System.out.println("Empty List!");
			return null;
		}
		Node curr = h;
		while(curr!=null){
			Node nxt = curr.getNext();
			while(nxt!=null && nxt.getData() == curr.getData()){
				nxt = nxt.getNext();
			}
			curr = nxt;
		}
		return h;
		
	}

}

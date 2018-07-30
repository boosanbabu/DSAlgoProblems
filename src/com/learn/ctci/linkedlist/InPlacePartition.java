package com.learn.ctci.linkedlist;

import com.learn.ds.linkedlist.Node;
import com.learn.ds.linkedlist.SinglyLinkedList;

/* 
 *  Partitioning a linked list around a given value and keeping the original order
	Given a linked list and a value x, partition it such that all nodes less than x come first, 
	then all nodes with value equal to x and finally nodes with value greater than or equal to x. 
	The original relative order of the nodes in each of the three partitions should be preserved. 
	The partition must work in-place.
	
	Examples:
	
	Input : 1->4->3->2->5->2->3,  (x = 3)
	Output: 1->2->2->3->3->4->5
	
	Input : 1->4->2->10  (x = 3)     
	Output: 1->2->4->10
 */

public class InPlacePartition {

	public static Node partionLLAround(int n, Node head)
	{
		if(head==null)
		{
			System.err.println("Empty List!");
			return null;
		}
		Node ptr = head;
		Node l = null, m = null, r = null;
		Node mStart = null, rStart = null, lStart = null;
		while(ptr!=null){
			Node nextNode = ptr.getNext();
			ptr.setNext(null);
			
			int d = ptr.getData();
			if(d<n){
				if(l==null)
				{
					lStart = ptr;
					l = ptr;
					ptr = nextNode;
					continue;
				}

				l.setNext(ptr);
				l = l.getNext();
				//doProcess(ptr,l,lStart);
			}
			else if(d>n){
				if(r==null)
				{
					rStart = ptr;
					r = ptr;
					ptr = nextNode;
					continue;
				}

				r.setNext(ptr);
				r = r.getNext();

				//doProcess(ptr,r,rStart);
			}
			else{
				if(m==null)
				{
					mStart = ptr;
					m = ptr;
					ptr = nextNode;
					continue;
				}

				m.setNext(ptr);
				m = m.getNext();
				//doProcess(ptr, m, mStart);
			}
			ptr = nextNode;
		}
		
		if(l!=null)
		{
			if(m!=null)
			{
				l.setNext(mStart);
				m.setNext(rStart);
			}
			else{
				l.setNext(rStart);
			}
			return lStart;
		}
		else{
			if(m!=null)
			{
				m.setNext(rStart);
				return mStart;
			}
			return rStart;
		}
			

		
		
		
	}
	
	public static void doProcess(Node ptr, Node track, Node start)
	{
		if(track==null)
		{
			start = ptr;
			track = ptr;
			return;
		}

		track.setNext(ptr);
		track = track.getNext();
	}
	
	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList("10->4->20->10->3");
		sll.setHead(partionLLAround(3,sll.getHead()));
		sll.display();
	}
	
	

}

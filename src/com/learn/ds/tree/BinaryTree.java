package com.learn.ds.tree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	
	BTNode root;
	
	BinaryTree(BTNode r){
		root = r;
	}
	
	void BFSTraverse(BTNode root){
		BFS(root, true,null,null);
	}
	
	
	BTNode BFS(BTNode root, boolean traverse, Integer searchElement, Integer insertElement){
		if(root==null){
			return root;
		}
		Queue<BTNode> q =  new LinkedList<BTNode>();
		q.add(root);
		while(!q.isEmpty()){
			BTNode temp = q.poll();
			
			if(traverse)
				System.out.print(temp.getData()+" ");
			
			if(searchElement!=null && searchElement == temp.getData()){
				System.out.println("\nFound " + searchElement);
				return root;
			}
			if( temp.getLeft()==null){
				if(insertElement!=null){
					temp.setLeft(new BTNode(insertElement));
					return root;
				}
					
			}else{
				q.add(temp.getLeft());
			}
			
			if(temp.getRight()==null){
				if(insertElement!=null){
					temp.setRight(new BTNode(insertElement));
					return root;
				}
			}else{
				q.add(temp.getRight());
			}
		}
		if(searchElement!=null){
			System.out.println("\nNot Found " + searchElement);
		}
		return root;
	}
	
	void insert(int d){
		insert(root,d);
	}
	
	BTNode insert(BTNode root, int d){
		return BFS(root,false,null,d);	
	}
	
	void searchBFS(BTNode root, int searchVal){
		BFS(root,false,searchVal,null);
	}

	void preOrderTraversal(){
		System.out.println();
		preOrderTraversal(root);
	}

	void postOrderTraversal(){
		System.out.println();
		postOrderTraversal(root);
	}

	void inOrderTraversal(){
		System.out.println();
		inOrderTraversal(root);
	}
	
	void preOrderTraversal(BTNode root){
		if(root==null)
			return;
		System.out.print(root.getData() + " ");
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}
	
	void postOrderTraversal(BTNode root){
		if(root==null)
			return;
		
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(root.getData() + " ");
	}
	
	
	void inOrderTraversal(BTNode root){
		
		if(root==null)
			return;
		
		inOrderTraversal(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrderTraversal(root.getRight());
	}
	
	void isBST(){
		boolean res = isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println("Is BST : " + res);
	}

	private boolean isBST(BTNode r, int min, int max) {
		if(r==null){
			return true;
		}
		
		if(r.getData()<=min || r.getData()>max){
			return false;
		}
		return isBST(r.getLeft(),min, r.getData()) && 
		 isBST(r.getRight(),  r.getData(),max);
		
		
	}
}

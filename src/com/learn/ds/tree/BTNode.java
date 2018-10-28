package com.learn.ds.tree;

public class BTNode {

	private BTNode left, right;
	private int data;
	
	BTNode(int d){
		setData(d);
	}
	
	BTNode(int d, BTNode l, BTNode r){
		setLeft(l);
		setRight(r);
		setData(d);
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

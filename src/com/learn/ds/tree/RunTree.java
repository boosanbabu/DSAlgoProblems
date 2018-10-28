package com.learn.ds.tree;

public class RunTree {

	public static void main(String[] args) {
		BTNode root = new BTNode(20);
		BinaryTree bt = new BinaryTree(root);
		
		bt.insert(13);
		bt.insert(33);
		bt.insert(-34);
		bt.insert(14);
		bt.insert(23);
		bt.BFSTraverse(root);
		bt.searchBFS(root, 33);
	//	bt.search(13);

		bt.preOrderTraversal();
		bt.inOrderTraversal();
		bt.postOrderTraversal();
		bt.isBST();
//		System.out.println(bt.minValue());
//		System.out.println(bt.maxValue());
	}
	
	

}

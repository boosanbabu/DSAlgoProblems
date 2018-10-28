package com.learn.ds.tree;

public class BinarySearchTree extends BinaryTree{

	

	BinarySearchTree(BTNode r) {
		super(r);
	}

	public void insert(int d){
		insert(root, d);
	}
	
	public BTNode search(int d){
		BTNode res = search(root,d);
		if (res==null){
			System.out.println("Element Not Found!");
			return null;
		}
		else{
			System.out.println("Found "+ d );
			return res;
		}
		
	}
	public BTNode search(BTNode root, int d){
		if(root==null){
			return null;
		}
		if(root.getData()==d)
			return root;
		
		if(root.getData()<d){
			return search(root.getRight(),d);
		}
		return search(root.getLeft(),d);
	}
	
	@Override
	public BTNode insert(BTNode root, int data){
		if(root==null){
			root = new BTNode(data);
			return root;
		}
		if(data< root.getData()){
			root.setLeft(insert(root.getLeft(),data));
		}
		else{
			root.setRight(insert(root.getRight(), data));
		}
		return root;
		
	}
	
	public int minValue(){
		if(root==null)
			System.out.println("No Tree!");
		return minValue(root);
	}

	private int minValue(BTNode root) {
		if(root!=null && root.getLeft()==null){
			return root.getData();
		}
		return minValue(root.getLeft());
	}
	
	public int maxValue(){
		if(root==null)
			System.out.println("No Tree!");
		return maxValue(root);
	}

	private int maxValue(BTNode root) {
		if(root!=null && root.getRight()==null){
			return root.getData();
		}
		return maxValue(root.getRight());
	}

}

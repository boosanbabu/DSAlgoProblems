package com.learn.algo.dp.problems;

public class Helper {

	public static void print2DArray(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static Element largestElement(int a[][]){
		int max = a[0][0];
		Element maxEle = new Element(0, 0, max);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(max<a[i][j]){
					max = a[i][j];
					maxEle.x = i;
					maxEle.y = j;
					maxEle.val = max;			
				}

			}
			
		}
		return maxEle;
	}
	
}
class Element{
	int x,y;
	int val;
	
	Element(int x,int y, int val){
		x = this.x;
		y = this.y;
		val = this.val;
	}
	
	public int getVal(){
		return val;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}

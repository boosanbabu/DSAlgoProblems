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

}

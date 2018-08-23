package com.learn.algo.dp.problems;

import java.util.ArrayList;

/**
 * Given weights and values of N items, put these items in a knapsack of maximum capacity W 
 * to get the maximum total value in the knapsack. 
 * Items cannot be split.
 * @author Boosan
 *
 */
public class KnapSack01 {

	public static int bottomUpDPSol(int wt[],int val[],int W){
		int k[][] = new int[wt.length+1][W+1];
		for(int i=0;i<=wt.length;i++){
			for(int j=0;j<=W;j++){
				if(i==0 || j==0){
					k[i][j]= 0;
					continue;
				}
				if(j<wt[i-1])
					k[i][j] = k[i-1][j];
				else
					k[i][j] = Math.max(val[i-1]+k[i-1][j-wt[i-1]], k[i-1][j]);
			}
		}
		
		getCombinations(k, wt);
		return k[val.length][W];	
	}
	
	private static ArrayList<Integer> getCombinations(int k[][], int wt[]){
		int W = k[0].length-1;
		int noOfItems = wt.length;
		System.out.print("\n\nWt Combinations : ");
		System.out.print("[");
		ArrayList<Integer> combo = new ArrayList<>();
		for(int i=noOfItems,j=W;i>0 && j>=0;i--){
			int prev = k[i-1][j];
			int curr = k[i][j];
			if(curr!=prev){
				System.out.print(" " + wt[i-1]+" ");
				combo.add(wt[i-1]);
				j=j-wt[i-1];
			}
				
		}
		System.out.print("]");
		System.out.println();
		return combo;
	}
	
	public static void main(String[] args) {
		int wt[] =  {1,2,3,4,5,6};
		int val[] = {5,3,4,2,6,7};
		int W = 10;
		String wtStr = "[ ";
		String valStr = "[ ";
		for(int i=0;i<wt.length;i++){
			wtStr = wtStr+wt[i] + " ";
			valStr = valStr+val[i] + " ";
		}
		wtStr=wtStr+"]";
		valStr=valStr+"]";
		
		System.out.println("Inputs\nWts " + wtStr+"\nVals "+valStr);
		System.out.println("Max. weight : " + W);
		System.out.println("Profit Value : " + bottomUpDPSol(wt,val,W));
	}
}

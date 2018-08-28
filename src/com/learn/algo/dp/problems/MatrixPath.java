package com.learn.algo.dp.problems;

public class MatrixPath {
/**
 * Find the minimum cost that would take to reach from start of matrix 
 * to End of Matrix
 * 
 * Cost = Sum of cell values in the path
 * 
 * A step can be made only to the right or down
 * 
 * 
 * @param args
 */
	
	private static int minCostFromStartToEnd(int inp[][], int rSize, int cSize){
		int res[][] = new int[rSize][cSize];
		
		//To reach elements in first row there is 
		//only one possible way - To move Right
		res[0][0] = inp[0][0];
		for(int j=1;j<cSize;j++){
			res[0][j] = res[0][j-1]+inp[0][j];
		}
		//To reach elements in first col, there is only one possible way - To Move Down
		for(int i=1;i<rSize;i++)
			res[i][0] = res[i-1][0] + inp[i][0];
		
		for(int i=1;i<rSize;i++){
			for(int j=1;j<cSize;j++){
				
				//If diagonal route is allowed the below expression changes to 
				// minPrev = min(res[i-1][j-1],res[i][j-1], res[i-1][j])
				int minPrev = Math.min(res[i][j-1], res[i-1][j]);
				res[i][j] = inp[i][j] + minPrev;
			}
		}
		return res[rSize-1][cSize-1];
		
	}
	//Count all possible paths to move from Top-Left element to Bottom-Right element in a matrix
	//Movements allowed are Right and Down
	private static int numberOfPossiblePaths(int inp[][], int rSize, int cSize){
		int res[][] = new int[rSize][cSize];
		
		for(int j=0;j<cSize;j++)
			res[0][j] = 1;
		
		for(int i=0;i<rSize;i++)
			res[i][0] = 1;	
		
		for(int i=1;i<rSize;i++){
			for(int j=1;j<cSize;j++){
				res[i][j] = res[i-1][j] + res[i][j-1];
			}
		}
		return res[rSize-1][cSize-1];
	}
	public static void main(String[] args) {
		int inp[][] = { {0,     0,     3,     2,     1},
						{15,	0,     7,     3,     8},
						{1,     0,     6,     5,     9},
						{1,     9,     9,     6,     8},
						{1,     1,     0,     1,     0}};
		int rSize = inp.length;
		int cSize = inp[0].length;
		Helper.print2DArray(inp);
		System.out.println("Min cost " + minCostFromStartToEnd(inp,rSize,cSize));
		System.out.println("Total Number of path from Top to Bottom : " + numberOfPossiblePaths(inp, rSize, cSize));
		
		System.out.println();
		
		int m[][] = { {1,2,3},
					  {1,2,3},
				      {1,2,3}};
		Helper.print2DArray(m);
		System.out.println("Min cost " + minCostFromStartToEnd(m,m.length,m[0].length));
		System.out.println("Total Number of path from Top to Bottom : " + numberOfPossiblePaths(inp, m.length,m[0].length));
		
	}

}

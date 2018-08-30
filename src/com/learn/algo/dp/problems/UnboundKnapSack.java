package com.learn.algo.dp.problems;
/**
 * 
 * @author Boosan
 * 
 * Given an array of positive integers and a target sum, 
 * determine the sum nearest to but not exceeding the target that can be created. 
 * To create the sum, use any element of your array zero or more times.
 *
 *	For example, if  arr=[2,3,4] and your target sum is 10, 
 *	you might select  [2,2,2,2,2], [3,3,2,2] or [3,3,4]. 
 *	In this case, you can arrive at exactly the target.
 *
 */
public class UnboundKnapSack {

	static int arr[] = {4,8};
	static int sum = 23;
	
	private static int unboundKnapSack(int arr[], int sum){
		int res[][] = new int[arr.length][sum+1];
		
		for(int i=0;i<arr.length;i++){
			res[i][0] = 0;
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=sum;j++){
				if(i==0 ){
					//Assuming all elements initialized to 0 already - JAVA
					if(j<arr[i])
						continue;
					else{
						res[i][j] = Math.max(res[i][j-arr[i]]+arr[i], res[i][j-1]);
					}
				}
				else{
					if(j<arr[i]){
						res[i][j] = res[i-1][j];
					}
					else{
						res[i][j] = Math.max(res[i-1][j],res[i][j-arr[i]]+arr[i]);
					}
				}
			}
		}
		Helper.print2DArray(res);
		return res[arr.length-1][sum];
	}


	public static void main(String ar[]){
		System.out.println("Max sum : " + unboundKnapSack(arr, sum));
	}
}	


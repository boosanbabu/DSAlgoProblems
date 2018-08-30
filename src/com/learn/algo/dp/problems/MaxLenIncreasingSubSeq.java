package com.learn.algo.dp.problems;
/**
 * Find the length of maximum increasing subsequence from an array
 * 1,2,3,-1,2,5,7,8,5,12,4,13
 * 
 * 
 * @author Boosan
 *
 */
public class MaxLenIncreasingSubSeq {

	public static void main(String[] args) {
//		[2,3,0,10,1,2,3,4,5,6,7]
//		[1,1,1,1,1,1]
		int arr[] = {11,2,3,10,11,12,13,4,5,16,7};
		System.out.println("Length of Max increasing sub-sequence : " + maxIncSubSeqLen(arr));
		

	}

	private static int maxIncSubSeqLen(int[] arr) {
		int res[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			res[i] = 1;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					if(res[i]<res[j]+1)
						res[i]=res[j]+1;
				}
			}
		}
		
		int maxLen = res[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			maxLen = maxLen<res[i]?res[i]:maxLen;
		}
		return maxLen;
	}

}

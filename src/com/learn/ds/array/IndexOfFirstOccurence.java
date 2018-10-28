package com.learn.ds.array;
/*
 * Given a Sorted array and a number, 
 * find the index of first occurrence of that number
 */

// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
// 1 2 2 2 3 4 5 5 5 5 5   5  5  8
public class IndexOfFirstOccurence {

	public static int indexOfFirstOcc(int a[], int n){
		if(a[0]==n)
			return 0;
		int res = binSearch(a, 1, a.length-1, n);
		return min(res, binSearch(a, 1, res, n));
		
	}
	private static int binSearch(int[] a, int i, int j, int n) {
		int mid = (i + j)/2 ;
		if(i>j)
			return -1;
		
		if(a[mid]==n){
			return mid;
		}
		if(a[mid]<n){
			return binSearch(a, mid+1, j, n);
			
		}
		
		return binSearch(a, i, mid-1, n);
	}
	
	public static int min(int a, int b){
		if(a<b)
			return a;
		return b;
	}
	public static void main(String[] args) {
		
		int arr[] = {-10,0,1,1,2,2,3,3,4,5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,9};
		int n = 3;
		System.out.println(indexOfFirstOcc(arr, n));
	}

}

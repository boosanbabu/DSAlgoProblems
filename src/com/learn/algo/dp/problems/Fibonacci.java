package com.learn.algo.dp.problems;

//Find nth Element in the Fibonacci Series - n Starts from 0
public class Fibonacci {
	
	static int[] mem = new int[100];
	static int counter;
	
	public static void main(String[] args) {
		counter=0;
		System.out.println(fib(10));
		System.out.println("Counter " + counter);
		counter=0;
		System.out.println(fibMemoize(10));
		System.out.println("Counter " + counter);
		
	}	
	
	public static int fib(int n){
		if(n<2)
			return 1;
		int val = fib(n-1) + fib(n-2);
		counter++;
		return val;
	}
	
	public static int fibMemoize(int n){
		if(mem[n]!=0)
			return mem[n];
		if(n<2){
			mem[0] = mem[1] = 1;
			return 1;
		}
		counter++;
		int val = fibMemoize(n-1) + fibMemoize(n-2);
		mem[n]= val;
		return val;
	}

}

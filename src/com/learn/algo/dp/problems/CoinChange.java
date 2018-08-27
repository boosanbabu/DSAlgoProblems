package com.learn.algo.dp.problems;

/*
 * You are given coins of different denominations and a total amount of money.
 * Write a function to compute the number of combinations that make up that amount. 
 */
public class CoinChange {

	static int[] coins = {1,2,5,10,20,50,100};

	public static void main(String[] args) {
		System.out.println(coinChangeRecursive(400,0));
		System.out.println(coinChangeDP(400));
	}
	
	public static int coinChangeRecursive(int amount,int currCoinIdx){
		if(amount<0)
			return 0;
		
		if(amount==0)
			return 1;
		
		int combinations = 0;
		for(int i=currCoinIdx;i<coins.length;i++){
				combinations += coinChangeRecursive(amount-coins[i],i);
		}
		return combinations;
	}
	
	public static int coinChangeDP(int amount){
		int combinations[] = new int[amount+1];
		combinations[0] = 1;
		for(int coin:coins){
			for(int i=coin;i<=amount;i++){
					combinations[i]=combinations[i]+combinations[i-coin];
			}
		}
		return combinations[amount];
		
	}

}

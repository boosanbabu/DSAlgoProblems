package com.learn.algo.dp.problems;
/**
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * @author Boosan
 *
 */
public class MinCoinChange {

	private static int minCoinCount(int amount, int coins[]){
		int noOfCoins = coins.length;
		int k[][] = new int[2][amount+1];
		
		//Initialize
		k[0][0] = 0;
		k[1][0] = -1;
		for(int j=1;j<amount+1;j++){
			k[0][j] = Integer.MAX_VALUE - 1;
			k[1][j] = -1;
		}
		
		for(int i=0;i<noOfCoins;i++){
			for(int j=0;j<=amount;j++){
				if(j>=coins[i]){
					k[0][j] = Math.min(k[0][j],1+k[0][j-coins[i]]);
					k[1][j] = i;
				}
			}
		}
		
		Helper.print2DArray(k);
		printCombinations(k[1], coins, amount);
		return k[0][amount];
	}
	
	private static void printCombinations(int k[], int coins[],int amount){
		System.out.println("Coin Combo ");
		for(int i=amount;i>0;){
			System.out.print(coins[k[i]] + " ");
			i-=coins[k[i]];
		}
	}
	
	public static void main(String[] args) {
		int coins[]={1,2,5};
		int amount = 6;
		minCoinCount(amount, coins);
	}
}

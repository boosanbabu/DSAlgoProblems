package com.hackerrank.dynamicprogramming;

//https://www.hackerrank.com/challenges/candies
import java.io.*;

public class Candies {
  public static void main(String[] args) throws IOException{
      int[] ar = {4, 3, 2, 5, 4, 1};
      int N = ar.length;
      
      int[] cc = new int[N];
      cc[0] = 1;
      for(int i = 1; i < N; i++){
          cc[i] = 1;
          if (ar[i] > ar[i-1]){
              cc[i] += cc[i-1];
          } 
          else {
        	  int j=i;
        	  while(j > 0 && ar[j] < ar[j-1] && cc[j] == cc[j-1]){
        		  j--;
        		  cc[j] += 1;
        	  }	   
      		}
          for(int c=0;c<N;c++){
        	  System.out.print(cc[c]+",");
          }
          System.out.println();
      }
      
      long sum = 0;
      for(int i = 0; i < N; sum += cc[i++]){}
      System.out.print(sum);
  }
}
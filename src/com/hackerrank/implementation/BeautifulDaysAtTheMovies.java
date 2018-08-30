package com.hackerrank.implementation;


import java.io.*;
import java.util.*;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	int count=0;
		for(int c=i;c<=j;c++){
			if(Math.abs(c-rev(c))%k==0)
				count++;
		}
		return count;


    }
    
    static int rev(int n){
        int rev = 0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println(result);

        scanner.close();
    }
}

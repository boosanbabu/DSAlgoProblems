package com.hackerrank.ds.arrays;

import java.io.*;
import java.util.*;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        
        long ar[] = new long[n+1];
        long max = Long.MIN_VALUE;
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            
            ar[a-1] += k;
            ar[b] -= k;
            }
                
      long sum = 0;      
      for(int i=0;i<n;i++){
        sum += ar[i];
        if(max<sum)
            max = sum;
      }
        return max;
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }
}

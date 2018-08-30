package com.hackerrank.implementation;


import java.io.*;
import java.util.*;

public class ElectronicShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max = Integer.MIN_VALUE+1;
        for(int i=keyboards.length-1;i>-1;i--){
            if(keyboards[i]>=b){
            	continue;
            }
            System.out.println("KEY : " + keyboards[i]);
            for(int j=drives.length-1;j>-1;j--){
                if(drives[j]>=b){
                	continue;
                }
                System.out.println("Drive :: " + drives[j]);
                int combo = keyboards[i]+drives[j];
                if(combo==b)
                	return b;
                if(combo<b && max<combo){
                    System.out.println(keyboards[i] + ":::" + drives[j]);
                	max = combo;
                 }
             }
        }
        if(max==Integer.MIN_VALUE+1)
            return -1;

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(moneySpent);

        scanner.close();
    }
}

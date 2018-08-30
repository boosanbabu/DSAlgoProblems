package com.hackerrank.implementation;


import java.io.*;
import java.util.*;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int max = Integer.MIN_VALUE + 1;
        for(int i=0;i<word.length();i++){
            int val = h[word.charAt(i)-'a'];
            max = val>max?val:max;
        }
        return max*word.length();
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println((String.valueOf(result)));

        scanner.close();
    }
}

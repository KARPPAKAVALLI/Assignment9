package com.assignment9;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    //2. Write a program to find transpose of a matrix
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and number of columns:");
        int n= sc.nextInt(),m= sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}

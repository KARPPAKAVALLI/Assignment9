package com.assignment9;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    //3. Write a program to generate the matrix with integers in spiral order.
    // Get size N from the user and generate an NxN spiral matrix.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        int left=0,right=n,top=0,bottom=n;
        System.out.println("Enter the elements:");
        while (left<right && top<bottom){
            for (int i = left; i <right ; i++) {
                matrix[top][i]=sc.nextInt();
            }
            top++;
            for (int i = top; i <bottom ; i++) {
                matrix[i][right-1]= sc.nextInt();
            }
            if(left>=right || top>=bottom)
                break;
            right--;
            for (int i = right-1; i >=left ; i--) {
                matrix[bottom-1][i]= sc.nextInt();
            }
            bottom--;
            for (int i = bottom-1; i >=top ; i--) {
                matrix[i][left]= sc.nextInt();
            }
            left++;
        }
        System.out.println("Spiral Order:");
        for (int a[]:matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}

package com.assignment9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {
    //1. Create a program that rotates the elements of an array to the right
    // by a specified number of positions. Get the array and the rotation count from the user
    public static void reverse(int start,int end,int a[]){
        while(start<end){
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the rotation count:");
        int k=sc.nextInt();
        k=k%n;
        reverse(0,n-1,a);
        reverse(0,k-1,a);
        reverse(k,n-1,a);
        System.out.println("The rotated array:"+ Arrays.toString(a));
    }
}

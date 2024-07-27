package com.assignment9;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    static void addWeight(float[][] arr,int person) {
        Scanner sc=new Scanner(System.in);
        float[] copy= Arrays.copyOf(arr[person-1],arr[person-1].length+1 );
        System.out.println("Enter the weight of "+person+"th person:");
        copy[copy.length-1]=sc.nextFloat();
        arr[person-1]=copy;
    }
    static float minWeight(float[][] arr,int person) {
        float min=Float.MAX_VALUE;
        for(int i=0;i<arr[person-1].length;i++) {
            min=Math.min(min, arr[person-1][i]);
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of persons: ");
        int n=sc.nextInt();
        System.out.println("Enter their current weight : ");
        float[][] arr=new float[n][1];
        for(int i=0;i<n;i++) {
            arr[i][0]=sc.nextFloat();
        }
       int person,choice;
       do{
           System.out.println("Choice 1: Add weight");
           System.out.println("Choice 2: Find Minimum Weight");
           System.out.println("Choice 3: Exit");
          choice=sc.nextInt();
          switch (choice){
             case 1:
                System.out.println("Enter user number");
                person=sc.nextInt();
                addWeight(arr,person);
                System.out.println(Arrays.toString(arr[person-1]));
                break;
             case 2:
                System.out.println("Enter user number");
                person=sc.nextInt();
                System.out.println(minWeight(arr,person));
                break;
             case 3:
                break;
             default:
                 System.out.println("Invalid choice");
                 break;
          }
       }while (choice!=3);
    }
}

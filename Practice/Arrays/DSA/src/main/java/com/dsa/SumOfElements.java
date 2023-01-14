package com.dsa;


import java.util.Scanner;
public class SumOfElements {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printarray(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int ans[] = takeInput();
        printarray(ans);
        int sum = sumOfElements(ans);
        System.out.println("Sum of elements of array is : " + sum);
    }
}

package com.dsa;

import java.util.Scanner;

public class LargestElement {
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
    public static int LargetsElementInArray(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int ans[] = takeInput();
        printarray(ans);
        int largest = LargetsElementInArray(ans);
        System.out.println("Largest : " + largest);
    }
}

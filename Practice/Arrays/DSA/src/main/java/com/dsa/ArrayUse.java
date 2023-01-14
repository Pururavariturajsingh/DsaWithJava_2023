package com.dsa;

import java.util.Scanner;
public class ArrayUse {
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

    public static void main(String[] args){
        int ans[] = takeInput();
        printarray(ans);
    }
}

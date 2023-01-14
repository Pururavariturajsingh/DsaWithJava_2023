package com.dsa;

import java.util.Scanner;

public class FindDuplicate {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static int findDuplicate(int arr[]){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( i == j ){
                    continue;
                }
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr1[] = takeInput();
        printArray(arr1);
        int ans = findDuplicate(arr1);
        System.out.println(ans);
    }
}

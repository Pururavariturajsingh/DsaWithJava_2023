package com.dsa;

import java.util.Scanner;
public class FindUnique {
   
    public static int uniqueNumber(int[] arr){        
        int k = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int j ;            
            for(j = 0; j < arr.length;j++){
            //     if(i == j){
            //         continue;
            //     }
            //     if(arr[i] == arr[j]){
            //         count++;
            //     }                    
            // }
            // if(count == 1){
            //     k = arr[i];
            // }
                if(i != j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = uniqueNumber(arr);
        System.out.println(ans);
    }
}

package com.dsa;

public class SwapAlternate {
    public static void swapAlternate(int[] arr){
        int k = 1;
        int i = 0;
        int j = 1;
        if(arr.length % 2 != 0){
            while(k <= ((arr.length - 1)/2)){            
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i += 2;
                k++;
            }
        }else{
            while(k <= (arr.length / 2) ){            
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i += 2;
                k++;
            }
        }        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);
        swapAlternate(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


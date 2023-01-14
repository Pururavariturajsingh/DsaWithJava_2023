package com.dsa;
import java.util.Scanner;
public class ArrangeNumbers {
    // approach 2
   public static int[] arrangeNumbers(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int left = 0;
        int right = n -1;
        int counter = 1;
        while(left <= right){
            if(counter % 2 == 1){
                arr[left] = counter;
                counter += 1;
                left += 1;
            }else{
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
                        
        }
        return arr;   
        
    }

    public static void main(String[] args) {
        int ans[] = arrangeNumbers();
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}    


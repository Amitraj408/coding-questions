package org.example.array;

import java.util.Arrays;

public class RightShiftNPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rightShiftNPlace(arr,2);
        
    }
    public static void rightShiftNPlace(int[] arr, int n){
        for (int j = 0; j <n ; j++) {
            int temp= arr[arr.length-1];
            for (int i = arr.length-2; i >=0 ; i--) {
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package org.example.array;

import java.util.Arrays;

public class LeftShiftNPlaces {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        leftShiftNPlace(arr,3);
    }
    public static void leftShiftNPlace(int[] arr,int n){

        for (int j = 0; j <n ; j++) {
            int temp=arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}

package org.example.array;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftShiftTheArray(arr);
    }
    public static void leftShiftTheArray(int[] arr){
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

}

package org.example.array;

import java.lang.reflect.Parameter;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,4};
        rotateArray(arr);
    }
    public static void rotateArray(int[] arr){
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp= arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

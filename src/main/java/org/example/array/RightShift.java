package org.example.array;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        //right shift all the element by 1 position
        int[] arr = {1,2,3,4,6,7};
        rightShift(arr);

    }
    public static void rightShift(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp=arr[arr.length-1-i];
            arr[i]=arr[i-1];
            arr[0]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

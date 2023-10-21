package org.example.array;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        //right shift all the element by 1 position
        int[] arr = {1,2,3,4,6,7};
        rightShift(arr);

    }
    public static void rightShift(int[] arr){
        int temp=arr[arr.length-1];

        //for loop going right to left direction but the insertion of element is going left to right
        for (int i = arr.length-2; i >0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

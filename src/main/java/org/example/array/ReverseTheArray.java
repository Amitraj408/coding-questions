package org.example.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr ={1,2,9,1,5,6};
        reverseArray(arr);
        reverseArrayByStream(arr);
    }
    public static void reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0;i--) {
            reversedArray[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
    public static void reverseArrayByStream(int[] arr){

        int[] reversedArray = IntStream.range(0, arr.length)
                .mapToObj(i -> arr[arr.length - 1 - i])
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}

package org.example.stream.array;

import java.util.Arrays;

public class SumOfAllElementOfArray {

    public static void main(String[] args) {
        //Implement a program to find the sum of all elements in an array.

        int[] arr1 = {2, 4, 6, 8, 10,12,15,11,30};
        findSumOfArray(arr1);

    }
    public static void findSumOfArray(int[] arr){
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}

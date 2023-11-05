package org.example.stream.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumOfAllElementOfArray {

    public static void main(String[] args) {
        //Implement a program to find the sum of all elements in an array.

        int[] arr1 = {2, 4, 6, 8, 10,12,15,11,30};
        findSumOfArray(arr1);
        findSumByReduce(arr1);

    }
    public static void findSumOfArray(int[] arr){
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
    public static  void findSumByReduce(int[] arr){
        int sum1 = Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(sum1);
        Arrays.stream(arr).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
package org.example.stream.array;

import java.util.Arrays;
import java.util.Comparator;

public class largestElementInArray {
    public static void main(String[] args) {

        //Create a program to find the largest element in an array.
        int[] arr = {3,5,8,2,9,16,5,9};
        findLargest(arr);
        findLargestBySort(arr);

    }
    public static void findLargest(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void findLargestBySort(int[] arr){
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
    }
}

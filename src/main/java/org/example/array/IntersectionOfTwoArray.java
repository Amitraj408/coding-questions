package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        //Create a program that finds the intersection of two arrays.
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {3, 6, 9, 12, 15};
        findIntersection(arr1, arr2);
        findIntersectionByStream(arr1, arr2);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (Integer num:arr1) {
            list.add(num);
        }
        List<Integer> commonNumber = new ArrayList<>();
        for (Integer num : arr2) {
            if (list.contains(num)){
                commonNumber.add(num);
            }
        }
        System.out.println(commonNumber);
    }
    public static void findIntersectionByStream(int[] arr1,int[] arr2){

        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        Arrays.stream(arr2).filter(num->!list.contains(num)).forEach(e-> System.out.println(e));
    }
}

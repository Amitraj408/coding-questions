package org.example.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 12, 15, 11, 30};
        int[] arr2 = {3, 6, 9, 12, 15, 6, 12};
        findIntersection2(arr1, arr2);

    }

    public static void findIntersection1(int[] arr1, int[] arr2) {
        Set<Integer> setOfNumbers = Arrays.stream(arr1).boxed().collect(Collectors.toUnmodifiableSet());
        Arrays.stream(arr2).boxed().filter(e -> setOfNumbers.contains(e)).toList().forEach(System.out::println);
        Arrays.stream(arr2).boxed().filter(setOfNumbers::contains).toList().forEach(System.out::println);

    }

    public static void findIntersection2(int[] arr1, int[] arr2) {
        List<Integer> union = Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(e -> e == num)).boxed().collect(Collectors.toList());
        System.out.println(union);
    }
}
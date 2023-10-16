package org.example.stream.numbers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class findDublicateElement {
    public static void main(String[] args) {
        Set<Integer> uniqueElement = new HashSet<>();
//        Stream.of(1, 2, 5, 7, 9, 2, 5, 6).filter(num -> !uniqueElement.add(num)).forEach(System.out::println);

        System.out.println();

        //find Unique Element
        List<Integer> listOfUniqueElement = Stream.of(1, 2, 5, 7, 9, 2, 5, 6).filter(num -> uniqueElement.add(num)).toList();
        System.out.print("Unique Elememt: "+listOfUniqueElement+" ");

        System.out.println();

        //find the total number of element in the stream
        long totalNumberOfElement = Stream.of(1, 2, 5, 7, 9, 2, 5, 6).count();
        System.out.println("Total Number of Count: "+totalNumberOfElement);

        System.out.println();

        //find the max element
        Integer maxValue = Stream.of(1, 2, 5, 7, 9, 2, 5, 6).max(Integer::compare).get();
        System.out.println("max value: "+maxValue);
        System.out.println();

        //sort the stream using java8
        List<Integer> integerInDescendingOrder = Stream.of(1, 2, 5, 7, 9, 2, 5, 6).sorted((o1, o2) -> o2 - o1).toList();
        System.out.println("integer in descending order: "+integerInDescendingOrder);


    }
}

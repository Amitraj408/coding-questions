package org.example.stream.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSecondHighest {
    public static void main(String[] args) {
        Integer[] arr ={12,16,45,11,18,22,19,20,45};

        Integer integer = Arrays.stream(arr).distinct().sorted((num1,num2)->num2-num1).skip(1).findFirst().orElse(0);
//        Arrays.stream(arr).sorted(Comparator.comparing()) //comparing always takes key extractor
        System.out.println(integer);
        System.out.println("-----");

        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(e-> System.out.println(e));

// 2.       Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        //comparator takes extractor
//        Arrays.stream(arr).collect(Collectors.collectingAndThen(Comparator.comparing((o1,o2)->o2-o1)))
    }
    public static void dontDoThis(int[] arr){

        //in the following code Comparator.comparing method expects a function that extracts a key from an element.
        // However, in case of Integer::compare as a key extractor,, which is not appropriate.
        //The Comparator.comparing method is used when you want to sort elements based on some property or key extracted from each element.
        // For example, if you have a list of objects, and you want to sort them based on their age, you would provide a function that extracts the age from each object as the key.

//        Arrays.stream(arr).sorted(Comparator.comparing(Integer::compare).reversed()).forEach(e-> System.out.println(e));

    }

}

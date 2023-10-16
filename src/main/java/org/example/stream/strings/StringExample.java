package org.example.stream.strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringExample {


    static List<Integer> listOfNumber = Arrays.asList(1,3,2,6,4,7,8,5,8);

    public static void main(String[] args) {
        //group the element by its size
        Stream.of("apple","banana","mango","cherry","date","grape").collect(Collectors.groupingBy(fruit->fruit.length()))
                .entrySet().stream().forEach(fruits-> System.out.println(fruits.getKey()+" "+fruits.getValue()));



    }
}

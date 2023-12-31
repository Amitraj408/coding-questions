package org.example.stream.array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChecksListIsEmptyOrNot {
    public static void main(String[] args) {

        //How to check if list is empty in Java 8 using Optional,if not null iterate through the list and print the object
        //note: here if it is .of or .ofNullable doesn't throw any exception because here arr1 is not null rather than a element in array is null
        List<Integer> arr1 = Arrays.asList(1, 2, 3, null, 4);
        Optional.ofNullable(arr1).stream().forEach(e -> System.out.println(e));
        System.out.println("-----");

        //here if we print the optional str then it will not throw exception but if we get the string
        //from the optional then it will throw noSuchElementException
        String str1 = null;
        Optional<String> optionalString1 = Optional.ofNullable(str1);
        System.out.println(optionalString1);

        //in the below it will throw nullPointerException even if we are printing the just optional string
        String str2 = null;
        Optional<String> optionalString2 = Optional.of(str2);
        System.out.println(optionalString2.get());


        //in the below program in case of .of it will throw exception even if we write .orElse()//orElseGet() but not in case of .ofNullable()
        //it will not throw exception
        int[] arr2=null;
        Optional.of(arr2).stream().forEach(e-> System.out.println(e));


        //note: you cannot use the emptyList create by orElseGet() because it returns the unmodifiable and it is just for fallback in case of exception occur
        List<Integer> findDublicate = Arrays.asList(1, 2, 3, 6, 4, 2, 9, 4, 2, 9, null);
        Optional.ofNullable(findDublicate)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop through each object and consider not null objects
                .forEach(System.out::println); // it will print tag names


        System.out.println("-----------------------------------------------");

        List<Integer> findDublicate2 = null;
        Optional.ofNullable(findDublicate2)
                .orElseGet(() -> {
                    List<Integer> uniqueNumber = new ArrayList<>();
                    uniqueNumber.add(12873);
                    return uniqueNumber;
                }).stream().map(num -> num + 4).forEach(e -> System.out.print(e));

        //ofNullable and of in case of throwing the exception

        System.out.println("-----------------");

        Optional<String> maybeString = Optional.ofNullable(null);
        String result = maybeString.orElse("Default Value");
        System.out.println(result);

        //it will throw the nullPointException but ofNullable don't throw null point exception
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o.orElseGet(Collections::emptyList));
    }
}

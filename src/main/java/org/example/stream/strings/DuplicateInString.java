package org.example.stream.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInString {
    public static void main(String[] args) {
        findUnique("hello");
        removeDuplicate("hello");

    }
    public static void findUnique(String str){
        //best way to find duplicate and unique character
        //input:hello
        //output for uniqueNumber: heo
        //output for duplicate character: l

        List<Character> duplicateCharacter = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).toList();
        System.out.println("unique Character: "+duplicateCharacter);
    }
    public static void removeDuplicate(String str){

        Set<Character> uniqueNumber = new HashSet<>();
        Set<Character> dublicate = str.chars().mapToObj(e -> (char) e).filter(e -> !uniqueNumber.add(e)).collect(Collectors.toUnmodifiableSet());
        System.out.println("uniqueNumber: "+uniqueNumber);
        System.out.println("duplicateNumber: "+dublicate);
    }
}

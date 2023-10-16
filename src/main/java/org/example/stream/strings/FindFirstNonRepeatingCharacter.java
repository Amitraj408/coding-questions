package org.example.stream.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str ="Student Tsechnique";
        String str1 = "Hello";

        Character firstNonRepeatingChar = str.chars().mapToObj(e -> Character.toLowerCase((char)e)).collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println("First Non Repeating Number: "+firstNonRepeatingChar);
    }
}

package org.example.stream.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoiner {

    public static void main(String[] args) {
        // [how-are-you?]
        String str = "how are you";

        String joinierString = Arrays.stream(str.split(" ")).collect(Collectors.joining("-", "[", "]")).toString();
        System.out.println(joinierString);
    }

}

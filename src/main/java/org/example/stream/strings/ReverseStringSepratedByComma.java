package org.example.stream.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringSepratedByComma {

    public static void main(String[] args) {
        //write a program to reverse individual words in a string, where
        //each word may be delimited by a dot, comma, space or tab,
        // like www.google.com should become www.elgoog.moc.

        String str = "www.google.com";
        String[] stringArray = str.split("\\.");
        String reversedString = Arrays.stream(stringArray).map(ReverseStringSepratedByComma::reverseWord).collect(Collectors.joining("."));
        System.out.println(reversedString);

    }
    public static String reverseWord(String str) {
        return str.chars().mapToObj(e -> (char) e).reduce("", (s, c) -> c + s, (a, b) -> b + a);
    }
}

package org.example.stream.strings;

import java.util.Arrays;

public class LargestAndSmallestWOrdInString {
    public static void main(String[] args) {
        //Write a program to find out the largest and smallest word in the string "This is an umbrella".

        String str = "This is an umbrella";
        Arrays.stream(str.split(" ")).max((word1,word2)->Integer.compare(word1.length(),word2.length()))
                .ifPresent(System.out::println);
    }
}

package org.example.stream.numbers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class palindromeNumber {

    // Write a Java program to check if a given number is a palindrome.

    public static void main(String[] args) {
        isPalindrome1(12344321);
        isPalindrome2(12344321);

    }

    public static void isPalindrome1(int number) {
        String stringNumber = String.valueOf(number);
        String reversedString = Stream.of(stringNumber).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining());
        if (stringNumber.equals(reversedString)) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    public static void isPalindrome2(int number) {

        String stringNumber = String.valueOf(number);
        String reversedString = stringNumber.chars().mapToObj(e -> (char) e).reduce("", (s, c) -> c + s, (s, t) -> t + s).toString();
        if (stringNumber.equals(reversedString)) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}

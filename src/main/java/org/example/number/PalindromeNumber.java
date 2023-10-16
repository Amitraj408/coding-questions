package org.example.number;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Write a Java program to check if a given string is a palindrome.

        int originalNumber = 123432;
        int number = originalNumber;

        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;

        }
        if (originalNumber == reversedNumber) {
            System.out.println("number is palindrom");
        } else {
            System.out.println("number is not palindrom");
        }

    }

}

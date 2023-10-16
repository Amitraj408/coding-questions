package org.example.stream.numbers;

public class SumOfDigit {
    public static void main(String[] args) {
        //Write a program to compute the sum of digits of a number.

        int number= 12345;
        findSumOfDigit(number);

    }
    public static void findSumOfDigit(int number){

        //numberString.chars() returns an IntStream of character
        // values (i.e., the ASCII values) of each character in numberString

        String numberString = String.valueOf(number);
        int sum = numberString.chars().peek(e-> System.out.print(e+",")).map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
}

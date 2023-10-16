package org.example.number;

public class SumOfDigit {
    public static void main(String[] args) {
        //Write a program to compute the sum of digits of a number.
        int originalNumber=123456;
        int number=originalNumber;
        int sumOfDigit=0;
        while(number>0){
            int unitDigit=number%10;
            sumOfDigit=sumOfDigit+unitDigit;
            number=number/10;
        }
        System.out.println("sum of the digit of "+originalNumber+" is: "+sumOfDigit);
    }
}

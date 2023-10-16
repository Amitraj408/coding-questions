package org.example.stream.numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber(3,10);
        System.out.println(isPrime(2));



    }
    public static boolean isPrime(int number){
        return number>1 && IntStream.range(2,number/2).noneMatch(divider->number%divider==0);

    }
    public static void findPrimeNumber(int startIndex,int endIndex){
        if(startIndex>1){
            List<Integer> listOfPrimeNumber = IntStream.rangeClosed(startIndex, endIndex)
                    .filter(num -> IntStream.rangeClosed(2, num / 2).noneMatch(divider -> num % divider == 0))
                    .boxed()
                    .collect(Collectors.toList());
            System.out.println(listOfPrimeNumber);
        }


    }
}

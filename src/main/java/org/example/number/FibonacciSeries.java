package org.example.number;

import java.util.stream.Stream;

public class FibonacciSeries {
    //Implement a program to calculate the Fibonacci sequence up to a given number using recursion.

    static int num1=0;
    static int num2=1;
    static int sum=0;
//        System.out.print(num1+" ");

//        System.out.print(num2+" ");

    public static void main(String[] args) {

        findFibonacciSeriesByRecursion(7);
        System.out.println("sum: "+sum);


    }
    public static void findFibonacciSeries(int number){
          int a=0;
        System.out.print(a+",");
          int b=1;
        System.out.print(b+",");
          while(number>2){
              int c=a+b;
              System.out.print(c+",");
              a=b;
              b=c;
              number--;
          }
    }
    public static void findFibonacciSeriesByStream(int limit){
        Stream<Integer> fibonacciStream = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(limit)
                .map(f -> f[0]);
        fibonacciStream.forEach(num-> System.out.println(num));


    }
    public static void findFibonacciSeriesByRecursion(int limit){
        if(limit>0){
            sum=num1+num2; //generating next value
            System.out.println(sum+" ");

            num1=num2;
            num2=sum;
            findFibonacciSeriesByRecursion(limit-1);
        }

    }

}

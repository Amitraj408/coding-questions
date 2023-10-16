package org.example.stream.numbers;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new Integer[]{0,1},f->new Integer[]{f[1],f[0]+f[1]}).limit(10).map(e->e[0])
                .forEach(System.out::println);
    }
}

package org.example.stream.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    static String str = "hello";
    
    public static void main(String[] args) {
        //reverse string
        String reversedString = Stream.of(str).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedString);
        System.out.println("------");
        

        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s2,s1) -> s2+s1);
        System.out.println(reversed);

        String reversString = str.chars()
                .collect(StringBuilder::new,
                        (b, c) -> b.insert(0, (char)c), (b1, b2) -> b1.insert(0, b2))
                .toString();
        System.out.println(reversString);

        System.out.println(IntStream.range(0, str.length())
                    .map(i -> str.charAt(str.length() - i - 1))
                    .collect(()->new StringBuilder(), (sb, c) -> sb.append((char) c), StringBuilder::append)
                    .toString());
    }
}

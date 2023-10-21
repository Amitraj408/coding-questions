package org.example.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {

        //input: my name is    Amit
        //output:ym eman si timA

        String str="my name is amit";
        reverseEachWord(str);

    }
    public static void reverseEachWord(String str){
        //don't filter the empty word to maintain the space between them
        String[] stringArray = str.split(" ");

        String reversedWord = Arrays.stream(stringArray)
                .map(word -> new StringBuilder(word).reverse().toString())
//                .collect(Collectors.toList())   this is not required
                .collect(Collectors.joining(" "));
        System.out.println(reversedWord);

    }
}

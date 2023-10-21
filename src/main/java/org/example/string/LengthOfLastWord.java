package org.example.string;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "welcome to India";
        findLengthOfLastWord(str);
        findLatWordLength(str);

    }
    public static void findLengthOfLastWord(String str){
        String[] stringArray = str.split(" ");
        System.out.println(Arrays.toString(stringArray));
        int length = stringArray[stringArray.length - 1].length();
        System.out.println(length);
    }
    public static void findLatWordLength(String str){
        //.isEmpty returns true if the length of the string is 0
        String lastWord = Arrays.stream(str.split(" ")).filter(e -> !e.isEmpty()).reduce((first, second) -> second).orElseGet(() -> "");
        System.out.println(lastWord);
        System.out.println(lastWord.length());


    }
}

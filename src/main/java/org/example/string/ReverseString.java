package org.example.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        reverseString(str);
        reverseStringByBuilder(str);
    }
    public static void reverseString(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i <charArray.length/2 ; i++) {
            int startIndex=i;
            int lastIndex=charArray.length-1-i;
            char temp=charArray[lastIndex];
            charArray[lastIndex]=charArray[startIndex];
            charArray[startIndex]=temp;
        }
        System.out.println(Arrays.toString(charArray));
    }
    public static void reverseStringByBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverseString = sb.reverse();
        System.out.println(reverseString);
    }
}

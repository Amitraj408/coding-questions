package org.example.string;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramString {
    public static void main(String[] args) {
        String str1="bbc";
        String str2="bcb";
        boolean b = anagramChecker(str1, str2);
        System.out.println(b);
        boolean c = anagramCheck(str1, str2);
        System.out.println(c);
        boolean d = anagramCheck1(str1, str2);
        System.out.println(d);

    }
    public static boolean anagramChecker(String str1,String str2){
        List<Character> list1 = str1.chars().mapToObj(e -> (char) e).toList();
        List<Character> list2 = str2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());


        if(list1.size()==list2.size()){
            for (Character ch:list1) {
                if (!list2.contains(ch)){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    public static boolean anagramCheck(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charCount1.put(ch, charCount1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            charCount2.put(ch, charCount2.getOrDefault(ch, 0) + 1);
        }

        return charCount1.equals(charCount2);
    }
    public static boolean anagramCheck1(String str1,String str2){

        //wrongly implemented in future if you are doing this correct it
        boolean flag=false;

        String[] stringArray1 = str1.split("");
        if(str1.length()!=str2.length()){
           return flag=false;
        }
        for (String str:stringArray1) {
            if(!str1.contains(str)){
                flag=false;
                break;
            }
        }
        return flag;
        }
}

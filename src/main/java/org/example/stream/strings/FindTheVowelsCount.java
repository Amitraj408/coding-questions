package org.example.stream.strings;

public class FindTheVowelsCount {
    public static void main(String[] args) {
        String str = "hello hello";
        long countOfVowel = str.chars().mapToObj(e -> Character.toLowerCase((char) e)).filter(e -> {
            return (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u');
        }).count();
        System.out.println(countOfVowel);
    }
}

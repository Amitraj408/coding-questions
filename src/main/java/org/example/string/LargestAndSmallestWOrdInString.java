package org.example.string;

public class LargestAndSmallestWOrdInString {
    public static void main(String[] args) {
        //Write a program to find out the largest and smallest word in the string "This is an umbrella".

        String str= "This is an umbrella";
        String[] arrayOfString = str.split(" ");
        int maxLength=0;
        String sb=null;
        for (String s:arrayOfString) {
            if(s.length()>maxLength)
                maxLength=s.length();
            sb=s;
        }
        System.out.println(sb);
        findLargestWord(str);

    }
    public static void findLargestWord(String str){
        String[] stringArray = str.split(" ");
        String smallest=stringArray[0];
        for (String s:stringArray) {
            if(s.length()>smallest.length()){
                smallest=s;
            }
        }
        System.out.println(smallest);
    }
}

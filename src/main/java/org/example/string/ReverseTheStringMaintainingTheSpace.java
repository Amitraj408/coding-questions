package org.example.string;

public class ReverseTheStringMaintainingTheSpace {
    public static void main(String[] args) {

        //reverse the string using maintaining the space between the words
        //input:my name is amit
        //output: ti masi eman
        reverseStringMaintainingSpace("welcome to India");
    }

    public static void reverseStringMaintainingSpace(String str){
        char[] inputArray = str.toCharArray();
        char[] resultArray = new char[inputArray.length];

        for (int i = 0; i <inputArray.length ; i++) {
            if(inputArray[i]==' '){
                resultArray[i]=' ';
            }
        }
        int j=resultArray.length-1;
        for (int i = 0; i <inputArray.length ; i++) {
            if (inputArray[i]!=' '){
                if(resultArray[j]==' '){
                    j--;
                }
                resultArray[j]=inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(resultArray));
    }
}

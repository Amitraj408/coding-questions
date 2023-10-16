package org.example.number;

public class SumOfAllElementOfArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10,12,15,11,30};
        int sum=0;
        for (Integer num:arr1) {
            sum+=num;
        }
        System.out.println(sum);
    }
}

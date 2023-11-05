package org.example.employee;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {3, 6, 9, 12, 15};
        int[] arr3 = {10,8,49,25,15,98,32};
//        List<Integer> listOfIntersectionNumber = Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(e -> e == num)).boxed().collect(Collectors.toList());

//        System.out.println(listOfIntersectionNumber);
//        findIntersection(arr1,arr2);
//        findNumberStartWithOne(arr3);
        practiceProblem();
    }
    public static void findIntersection(int[] arr1,int[] arr2){
        List<Integer> list = new ArrayList<>();
        for (int num:arr1) {
           list.add(num);
        }
        for (int num:arr2) {
            if(list.contains(num)){
                System.out.println(num);
            }
        }
    }
    public static void findNumberStartWithOne(int[] arr){
        List<String> list = Arrays.stream(arr).mapToObj(num -> num + "").filter(str -> str.startsWith("1")).toList();

        System.out.println("------");
        System.out.println(list);
    }
    public static void practiceProblem(){
        List<Integer> findDublicate2 = null;
        Optional.ofNullable(findDublicate2)
                .orElseGet(() -> {
                    List<Integer> uniqueNumber = new ArrayList<>();
                    uniqueNumber.add(12873);
                    return uniqueNumber;
                }).stream().map(num -> num + 4).forEach(e -> System.out.print(e));
    }


}

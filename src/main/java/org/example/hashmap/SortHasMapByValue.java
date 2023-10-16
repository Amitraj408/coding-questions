package org.example.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class SortHasMapByValue {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Amit raj");
        map.put(6,"Mukesh shukla");
        map.put(2,"Vinay kumar");
        map.put(7,"Mohit rana");;
        map.put(4,"Munna bhaiya");
        map.put(3,"Ravi bhushan");
        map.put(5,"Bumba tripathi");

        System.out.println(map);
        sortHashMapValue1(map);
        sortHashMapValue2(map);

    }
    public static void sortHashMapValue1(Map<Integer,String> map){
        //comparingByValue returns the comparator
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> System.out.println(e));
    }
    public static void sortHashMapValue2(Map<Integer,String> map){

        //here (e1,e2)->e1 explanation- in case of collision the value should be e1 value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new))
                .forEach((k,v)-> System.out.println(k+"  "+v));
    }
}

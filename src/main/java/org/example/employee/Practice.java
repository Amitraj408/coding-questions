package org.example.employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,6,3,9,4,10);
        List<String> fruits =Arrays.asList("apple","grapes","pineapple","pumpkin");
        int sum = numbers.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
        Integer integer = numbers.stream().reduce(Integer::sum).get();
        System.out.println(integer);
        System.out.println("---");
        Integer reduce = numbers.stream().reduce(1, (a, b) -> a + b,(a,b)->a+b);
        System.out.println(reduce);
        Integer integer1 = numbers.stream().reduce((a, b) -> a + b).get();
        System.out.println(integer1);
        Integer multiplication = numbers.stream().reduce(1, (num1, num2) -> num1 * num2);
        System.out.println("multiplication: "+multiplication);
        Integer greatestNumber = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
        System.out.println("Greatest Number: "+greatestNumber);
        Integer maxByMethodRefrence = numbers.stream().reduce(Integer::max).get();
        System.out.println("maxByMethodRefrence: "+maxByMethodRefrence);

        String fruitWithMaxLength = fruits.stream().reduce((fruit1, fruit2) -> fruit1.length() > fruit2.length() ? fruit1 : fruit2).get();
        System.out.println("fruitWithMax Length: "+fruitWithMaxLength);
    }

}

package org.example.number;

public class FactorialUsingRecursiveMethod {

    public static void main(String[] args) {
        FactorialUsingRecursiveMethod obj = new FactorialUsingRecursiveMethod();
        System.out.println(obj.findFactorial(5));

    }
    public  int findFactorial(int num) {
        if(num==0){
            return 1;
        }
        int factorial = (num)*findFactorial(num - 1);
        return factorial;
    }
}

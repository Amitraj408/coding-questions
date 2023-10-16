package org.example.number;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));

    }
    public static boolean isPrime(int num){
        boolean flag=true;
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                flag= false;
                break;

            }

        }
        return flag;
    }

}

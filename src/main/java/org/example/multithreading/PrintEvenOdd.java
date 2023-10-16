package org.example.multithreading;

public class PrintEvenOdd extends Thread{

    private String threadName;

    public PrintEvenOdd(String threadName) {
        this.threadName=threadName;
    }

    public void run(){
        int number=0;
        while(number<=10){
            if(number%2==0 && Thread.currentThread().getName().equals("evenThread")){
                System.out.println(Thread.currentThread().getName()+number);
                number++;
            }
            if(number%2!=0 && Thread.currentThread().getName().equals("oddThread")){
                System.out.println(Thread.currentThread().getName()+number);
                number++;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1= new PrintEvenOdd("evenThread");
        t1.start();
        Thread t2 = new PrintEvenOdd("oddThread");
        t2.start();
    }
}

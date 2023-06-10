package com.company;
class thread1 extends Thread{
    public void run(){
        System.out.println("thread1");
        System.out.println("thread2");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("thread3");
        System.out.println("thread4");
    }
}

public class EXAM_ExtendThread {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}

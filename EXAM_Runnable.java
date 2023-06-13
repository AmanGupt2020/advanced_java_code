package com.company;
class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread1");
        System.out.println("thread2");
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread3");
        System.out.println("thread4");
    }
}

public class EXAM_Runnable {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread t3=new Thread(t1);
        Thread t4=new Thread(t2);
        t3.start();
        t4.start();
    }
}

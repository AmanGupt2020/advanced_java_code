package com.company;


public class Exam_Interface_class implements Exam_Interface{
    @Override
    public void area() {
        System.out.println("aman gupta");
    }

    public static void main(String[] args) {
        Exam_Interface_class e=new Exam_Interface_class();
        e.area();
    }
}

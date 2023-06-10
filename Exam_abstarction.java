package com.company;
abstract class Exam_abstarction {
    abstract void are();
}
class Class extends Exam_abstarction{
    public void are(){
        System.out.println("aman");
    }
}

class base{
    public static void main(String[] args) {
        Exam_abstarction e=new Class();
        e.are();
    }
}


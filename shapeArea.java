package com.company;
import java.util.Scanner;
public class shapeArea implements Area{  //interfacing shapeArea class with Area.java
    @Override
    public void square() {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextInt();
        double areaOfSquare=a*a;
        System.out.println("area of square :"+areaOfSquare);
        String str=sc.next();
        System.out.println(str);
        float s=sc.nextFloat();
        System.out.println(s);

    }
    public static void main(String[] args){
        shapeArea g=new shapeArea();
        g.square();
    }
}


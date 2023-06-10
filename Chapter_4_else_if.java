package com.company;
import java.util.Scanner;
public class Chapter_4_else_if {
    public static void main(String[] args){
       int age;
        System.out.println("enter age :");
        Scanner s= new Scanner(System.in);
        age=s.nextInt();
        if(age>50){
            System.out.println("you are experienced");
        }
        else if(age>40){
            System.out.println("you are half experienced");
        }
        else if(age>30){
            System.out.println("you are less experieneced");
        }
        else{
            System.out.println("you are non experienced");
        }
    }
}

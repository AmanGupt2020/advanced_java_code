package com.company;
import java.util.Scanner;
public class Chapter_4_switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter any age :");
        Scanner s= new Scanner(System.in);
        age=s.nextInt();
        switch(age){
            case 18:
                System.out.println("you are mature");
                break;
            case 20:
                System.out.println("you should do job");
                break;
            case 30:
                System.out.println("you are experienced enough to transfer job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("enjoy your life");
        }
    }
}

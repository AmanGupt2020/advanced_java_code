package com.company;
import java.util.Scanner;
public class EVENorODD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a==0){
            System.out.println("is zero");
        }
        else if(a>0){
            System.out.println("is positive number ");
        }
        else{
            System.out.println("is negative number");
        }
    }
}

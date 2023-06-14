package com.company;

public class interface2_class implements interface2{
    @Override
    public void square() {
         int a=10;
        System.out.println(a*a);
    }
    public static void main(String[] args){
        interface2_class i=new interface2_class();
        i.square();
    }
}

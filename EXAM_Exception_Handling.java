package com.company;

import com.sun.net.httpserver.Authenticator;

public class EXAM_Exception_Handling {
    public static void main(String [] args){
        try{
            int a=25/0;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("final");
        }
        System.out.println("success");

    }
}

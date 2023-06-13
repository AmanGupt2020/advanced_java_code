//Using Console Class
package com.company;
import java.io.Console;
import java.io.*;
public class Exp1_2 {
    public static void main(String[] args) throws IOException {


        //Input using console Class
        Console console = System.console();




       if (console == null) {
            System.err.println("Hello world");
           System.exit(1);
        }
        String name = console.readLine("Hello world");
        console.printf("console: "+name);
        System.exit(1);



    }
}

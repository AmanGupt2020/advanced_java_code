package com.company;

public class exception2 {
    public static void main(String[] args) {
        try {
            int b = 1 / 0;

        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("error");
        }
        finally {
            System.out.println("executed");
        }

    }
}

//NAME:- AMAN GUPTA
//R.NO:- 20BCE10347
package com.company;
import java.util.Scanner;
public class answer_2 {
    public static double Area(int r)
    {
        double area = 3.14 * r * r;
        return area;

    }

    public static double perimeter(int r)
    {
        double peri = 2 * 3.14 * r;
        return peri;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius: ");
        int data = sc.nextInt();
        double circleArea = Area(data);
        double circlePerimeter = perimeter(data);
        System.out.println("Area of the circle: "+circleArea);
        System.out.println("Perimeter of the circle: "+circlePerimeter);
        sc.close();


    }

}

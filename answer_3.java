//NAME:- AMAN GUPTA
//R.NO:- 20BCE10347
package com.company;
import java.util.Scanner;
public class answer_3 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int rows, columns;
        sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();

        System.out.print("Enter Number of Columns : ");
        columns = sc.nextInt();


        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= columns; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}

package com.company;
import java.util.Scanner;

public class Chapter_4_practice_ques {
    public static void main(String[] args) {
//-------------------question 1-------------------------------------------------------------
    //    int a= 10;
    //    if(a==11){
    //        System.out.println("i am  11");
    //    }
    //    else{
    //        System.out.println("i am not 11");
    //    }


//---------------------question 2------------------------------------------------------------
    /*    byte math;
        byte phy;
        byte chy;
        System.out.println("enter math marks :");
        Scanner s1= new Scanner(System.in);
        math= s1.nextByte();
        System.out.println("enter phy marks :");

        phy= s1.nextByte();
        System.out.println("enter chy marks :");

        chy= s1.nextByte();
        float avg;
        avg= (math+chy+phy)/3.0f;
        System.out.println("overall percentage is :"+avg);
        if(avg>=40 && math>=33 && phy>=33 && chy>=33){
            System.out.println("you are pass");
        }

    else{
        System.out.println("you are totally fail");
    }
     */

//---------------------------question 3-----------------------------------------------------------

    /*    double income;
        System.out.println("enter your income :");
        Scanner s = new Scanner(System.in);
        income = s.nextFloat();
        if( income>=1000000.0){
            System.out.println(" you have to pay 30% tax");
        }
        else if(income>=500000.0 && income<1000000.0){
            System.out.println("you have to pay 20% tax");
        }
        else if(income>=250000.0 && income<500000.0){
            System.out.println("you have to pay 5% tax");
        }
        else{
            System.out.println("there is no tax to pay");
        }
      */

//--------------------------------------question 3 0r-----------------------------------------------
/*    float income;
    float tax= 0;
        System.out.println(" enter the income :" );
    Scanner s=new Scanner(System.in);
    income = s.nextFloat();
    if(income <=2.5f) {
        tax = tax + 0;
    }
        else if(income>2.5f && income<=5.0f){

            tax= tax+ 0.05f*(income-2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            tax= tax+  0.05f*(5f-2.5f);
            tax= tax+ 0.2f*(income- 5f);
        }
        else if(income>10.0f){
            tax= tax+  0.05f*(5f-2.5f);
            tax= tax+ 0.2f*(10f- 5f);
            tax= tax+ 0.3f*(income-10f);
        }
        System.out.println("the ammount is to pay for th employee's :"+ tax);
*/

//----------------------------------question 4-----------------------------------------------
/* Scanner s= new Scanner(System.in);
 int day = s.nextInt();
 switch(day){
     case 1:
         System.out.println("monday");
         break;
     case 2:
         System.out.println("tuesday");
         break;
     case 3:
         System.out.println("wednesday");
         break;
     case 4:
         System.out.println("thursday");
         break;
     case 5:
         System.out.println("friday");
         break;
     case 6:
         System.out.println("saturday");
         break;
     case 7:
         System.out.println("sunday");
         break;

 }
*/

//--------------------------question 5---------------------------------------------------
   /*     int year;
        Scanner s= new Scanner(System.in);
        year= s.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
*/

//----------------------------question 6------------------------------------------------------
        System.out.println("enter any site:");
        Scanner sc= new Scanner(System.in);
        String website= sc.next();

        if(website.endsWith("com")) {
            System.out.println(" commercial site");
        }
            else if (website.endsWith("org")){
                System.out.println(" organization site");
            }
        else if(website.endsWith("in")){
            System.out.println("indian site");
        }
            }

}

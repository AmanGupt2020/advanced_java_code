{"date":"2023-04-12T14:56:45+05:30"}
package com.company;

abstract class abstract_class {
     abstract void print();

}
class abstarct_employee extends abstract_class {
     void print() {
          System.out.println("aman");

     }


     public static void main(String[] args){
          abstarct_employee e=new abstarct_employee();
          e.print();
     }
}


package com.company;

public class javaBean2 implements java.io.Serializable{
    private int id;
    private String name;
  //  public javaBean2(){
//
  //  }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getId(){
            return id;
        }
        public void setId(int id){
          this.id=id;
        }

public static void main(String args[]){
    javaBean2 j=new javaBean2();
    j.setId(100);
    j.setName("aman");
    System.out.println(j.getId());
    System.out.println(j.getName());
}

}

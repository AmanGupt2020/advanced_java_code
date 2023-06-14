package com.company;
import com.company.Interface_outer.interface_inner;
public class interface_outer_class implements interface_inner{
    @Override
    public void inner() {
        for(int i=2;i<=20;i++){
            int x=0;
            if(i==2){
                System.out.println("2");
            }
            else{
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        x=1;
                    }
                }
                if(x==0){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args){
        interface_outer_class g=new interface_outer_class();
        g.inner();
    }
}


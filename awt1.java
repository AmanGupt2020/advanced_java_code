package com.company;
import java.awt.*;
/*public class awt1 extends Frame{
    awt1(){
        Button b=new Button("click me");
        add(b);
        b.setBounds(80,80,80,30);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new awt1();
    }

} */


public class awt1 {
    awt1(){
        Frame f=new Frame("new");
        TextField t=new TextField();
        Label l=new Label("name");
        f.add(t);
        f.add(l);
        t.setBounds(100,80,80,30);
        l.setBounds(20,80,80,30);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new awt1();
    }


}


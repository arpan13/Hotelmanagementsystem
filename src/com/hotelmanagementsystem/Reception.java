package com.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class Reception extends JFrame {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;


    Reception(){


        b1=new JButton("New Customer Form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(10,30,200,30);
        //b1.addActionListener(this);
        add(b1);


        b2=new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(10,70,200,30);
        //b1.addActionListener(this);
        add(b2);


        b3=new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(10,110,200,30);
        //b1.addActionListener(this);
        add(b3);


        b4=new JButton("All Employee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.white);
        b4.setBounds(10,150,200,30);
        //b1.addActionListener(this);
        add(b4);


        b5=new JButton("Customer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.white);
        b5.setBounds(10,190,200,30);
        //b1.addActionListener(this);
        add(b5);


        b6=new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.white);
        b6.setBounds(10,230,200,30);
        //b1.addActionListener(this);
        add(b6);


        b7=new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.white);
        b7.setBounds(10,270,200,30);
        //b1.addActionListener(this);
        add(b7);


        b8=new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.white);
        b8.setBounds(10,310,200,30);
        //b1.addActionListener(this);
        add(b8);


        b9=new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.white);
        b9.setBounds(10,350,200,30);
        //b1.addActionListener(this);
        add(b9);


        b10=new JButton("Pick Up Service");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.white);
        b10.setBounds(10,390,200,30);
        //b1.addActionListener(this);
        add(b10);


        b11=new JButton("Search Room");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.white);
        b11.setBounds(10,430,200,30);
        //b1.addActionListener(this);
        add(b11);


        b12=new JButton("Logout");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.white);
        b12.setBounds(10,570,200,30);
        //b1.addActionListener(this);
        add(b12);



        ImageIcon i1=new ImageIcon(ClassLoader
                .getSystemResource("com/hotelmanagementsystem/icons/fourth.jpg"));
        Image i2=i1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l2=new JLabel(i3);
        l2.setBounds(250,30,500,500);
        add(l2);






        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(350,200,800,570);
        setVisible(true);

    }


    public static void main(String[] args) {
       new Reception().setVisible(true);
    }
}

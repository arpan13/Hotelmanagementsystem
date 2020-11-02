package com.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

    JLabel l1,l2,status,available,room,price,bed;
    JTextField t1,t2;
    JButton b1,b2;
    JComboBox c1,c2,c3;
    AddRoom(){

        l1=new JLabel("Add Room");
        l1.setBounds(200,20,100,20);
        l1.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l1);

        room=new JLabel("Room Number");
        room.setBounds(60,80,120,30);
        room.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(room);

        t1=new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);

        available=new JLabel("Available");
        available.setFont(new Font("Tahoma",Font.PLAIN,17));
        available.setBounds(60,130,120,30);
        add(available);



        c1=new JComboBox(new String[]{"Available","Occupied"});
        c1.setBounds(200,130,150,30);
        c1.setBackground(Color.white
        );
        add(c1);

        status=new JLabel("Cleaning Status");
        status.setFont(new Font("Tahoma",Font.PLAIN,17));
        status.setBounds(60,180,120,30);
        add(status);

        c2=new JComboBox(new String[]{"Cleaned","Dirty"});
        c2.setBounds(200,180,150,30);
        c2.setBackground(Color.white
        );
        add(c2);

        price=new JLabel("Price");
        price.setFont(new Font("Tahoma",Font.PLAIN,17));
        price.setBounds(60,230,120,30);
        add(price);

        t2=new JTextField();
        t2.setBounds(200,230,150,30);
        add(t2);

        bed=new JLabel("Bed Type");
        bed.setFont(new Font("Tahoma",Font.PLAIN,17));
        bed.setBounds(60,280,120,30);
        add(bed);

        c3=new JComboBox(new String[]{"Single Bed","Double Bed"});
        c3.setBounds(200,280,150,30);
        c3.setBackground(Color.white
        );
        add(c3);




        b1=new JButton("Add Room");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(60,350,120,30);
        b1.addActionListener(this);
        add(b1);



        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(200,350,120,30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1=new ImageIcon(ClassLoader
                .getSystemResource("com/hotelmanagementsystem/icons/twelve.jpg"));
        Image i2=i1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l2=new JLabel(i3);
        l2.setBounds(400,30,500,400);
        add(l2);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(350,200,900,500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){


            String room=t1.getText();
            String price=t2.getText();
            String available=(String)c1.getSelectedItem();
            String status=(String)c2.getSelectedItem();
            String bed=(String)c3.getSelectedItem();

            conn c=new conn();

            String str="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+bed+"')";

            try{
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"New Room Added");
                this.setVisible(false);
            }catch (Exception e){

            }

        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
       new AddRoom().setVisible(true);
    }
}

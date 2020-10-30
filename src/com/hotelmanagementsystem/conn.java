package com.hotelmanagementsystem;

import java.sql.*;


public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","13021999");
            s=c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

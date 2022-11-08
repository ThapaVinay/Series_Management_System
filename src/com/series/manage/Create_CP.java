package com.series.manage;

import java.sql.DriverManager;
import java.sql.Connection;

public class Create_CP {
    
    static Connection con;
    public static Connection create(){
        try{

            Class.forName("com.mysql.jdbc.Driver");  // it is used to load the drivers
            String user = "vinay";
            String password = "vinay";
            String url = "jdbc:mysql://localhost:3306/series_manage";
            con = DriverManager.getConnection(url, user, password); // create the connection
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}

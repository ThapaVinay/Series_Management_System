package com.series.manage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Series_to_DB {     
     public  static boolean insert(Series s)
     {
        boolean flag = false;
        try{
            Connection con = Create_CP.create();
            String q = "insert into series(series_name,status,ratings) values (?,?,?)";
            PreparedStatement pre = con.prepareStatement(q);

            pre.setString(1, s.getSeriesName());
            pre.setString(2, s.getStatus());
            pre.setInt(3, s.getRatings());

            pre.executeUpdate();
            flag = true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }     
        return flag;
     }

     public static void display()
     {
        try{
            Connection con = Create_CP.create();
            String q = "Select * from series";
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(q);
            System.out.printf("%16s %16s %16s %16s\n","SR No", "Name" ,"Status" ,"Ratings");
            while(set.next())
            {   
                System.out.printf("%16d %16s %16s %16d\n",set.getInt(1),set.getString(2),set.getString(3),set.getInt(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }


     public static boolean delete(int id)
     {
        boolean flag = true;
        try{
            Connection con = Create_CP.create();
            String q = "delete from series where sr_no = ?";

            PreparedStatement pre = con.prepareStatement(q);
            pre.setInt(1,id);
            pre.executeUpdate();
            flag = true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return flag;
     }
}

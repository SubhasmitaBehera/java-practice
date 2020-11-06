package jdbc.test;

import java.sql.*;

public class TestConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/DATABASE1";
        String userName = "root";
        String passWord = "ssubhasmita10";
        Connection connection = DriverManager.getConnection(URL,userName,passWord);
        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("select * from metable1");

        while (res.next()){
            System.out.println(res.getString(1)+" "+res.getInt(2));
        }
        System.out.println("---------------------------------------------------");
         res = stmt.executeQuery("select name, age from metable1");

        while (res.next()){
            System.out.println(res.getString(1)+" "+res.getInt(2));
        }
        System.out.println("----------------------------------------");
        res = stmt.executeQuery("select name from metable1");

        while (res.next()){
            System.out.println(res.getString(1));
        }
    }
}

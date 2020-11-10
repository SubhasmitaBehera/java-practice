package jdbc.test;

import java.sql.*;

public class StatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver"); // this line is not required now . This is now discarded. so no
//        need to write this line.

        String URL = "jdbc:mysql://localhost:3306/database2"; // JDBC url
        String userName = "root";
        String password = "bablu";

        // DriverManager helps to connect user with Driver(jar).
        Connection connection = DriverManager.getConnection(URL,userName,password);

        Statement st = connection.createStatement();

        ResultSet res = st.executeQuery("select * from table1");
//        ResultSet res = st.executeQuery("create database saroj");

        while (res.next())
        {
            System.out.println(res.getString(1)+" "+res.getInt(2));
        }

        res = st.executeQuery("select age from table1");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_" +
                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        while (res.next())
        {
            System.out.print(" "+res.getString(1));
        }

        System.out.println();

        res = st.executeQuery("show tables");

        System.out.println("Tables in the database are : ");
        while (res.next()) {
            System.out.println(res.getString(1));
        }


    }
}

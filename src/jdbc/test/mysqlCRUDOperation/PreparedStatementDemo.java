package jdbc.test.mysqlCRUDOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) throws SQLException, IOException {


        String URL = "jdbc:mysql://localhost:3306/database2";
        String pass = "bablu";
        String user = "root";

        Connection connection = DriverManager.getConnection(URL,user,pass);

        String sqlQuery = "create table Employee8 (empid int, empname varchar(10), age int)";

        PreparedStatement ps = connection.prepareStatement(sqlQuery);

        PreparedStatement ps1 = connection.prepareStatement("insert into employee8 values (?,?,?)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        ps.executeUpdate(sqlQuery);

//        while (true) {
//            System.out.print("enter employee id : ");
//            String assign = br.readLine(); // takes a string as input
//            int id = Integer.parseInt(assign);
//            ps1.setInt(1, id);
//
//            System.out.print("enter employee name : ");
//            String name = br.readLine();
//            ps1.setString(2, name);
//
//            System.out.print("enter employee age : ");
//            String assign1 = br.readLine();
//            int age = Integer.parseInt(assign1);
//            ps1.setInt(3, age);
//
//            ps1.executeUpdate();
//
//            System.out.println("want to add more [y/n]");
//            String choice = br.readLine();
//
//            if (choice.equals("y")) {
//                continue;
//            }
//            else
//                break;
//        }
//
//
        Statement st = connection.createStatement();
        ResultSet res = st.executeQuery("select * from employee6");
//        while (res.next())
//        {
//            System.out.println(res.getInt(1)+" \t"+res.getString(2)+ " \t"+res.getInt(3));
//        }

        PreparedStatement ps2 = connection.prepareStatement("update employee8 set empname = ?, age = ?" +
                " where empid = ?;");

        System.out.print("enter employee name to update : ");
        String assign = br.readLine();  // takes a string as input


        ps2.setString(1,assign);

        ps2.setInt(2,19);
        ps2.setInt(3,3);

        ps2.executeUpdate();

        res = st.executeQuery("select * from employee8");

        while (res.next())
        {
            System.out.println(res.getInt(1)+" \t"+res.getString(2)+ " \t"+res.getInt(3));
        }

    }
}

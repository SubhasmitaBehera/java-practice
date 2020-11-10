package jdbc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConnection3 {
    public static void main(String[] args) throws SQLException, IOException {
        String URL = "jdbc:mysql://localhost:3306/database2";
        String userName = "root";
        String passWord = "ssubhasmita10";

        Connection connection = DriverManager.getConnection(URL,userName,passWord);
        PreparedStatement ps = connection.prepareStatement("cteate table employee (id int , name varchar , age int");

        PreparedStatement ps1 = connection.prepareStatement("insert into employee values (?,?,?)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
}

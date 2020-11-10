package jdbc.test.mysqlCRUDOperation;

import java.io.IOException;
import java.sql.*;

public class CreateQueryDemo {
    public static void main(String[] args) throws SQLException, IOException {


        String URL = "jdbc:mysql://localhost:3306/database2";
        String pass = "bablu";
        String user = "root";

        Connection connection = DriverManager.getConnection(URL, user, pass);

        String sqlQuery = "create table Employee12 (empid int, empname varchar(10), age int)";

        PreparedStatement ps = connection.prepareStatement(sqlQuery);

//        ps.executeUpdate();

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery("describe Employee12");

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }



    }
}

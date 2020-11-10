package jdbc.test.mysqlCRUDOperation;

import java.sql.*;

public class RetrieveQueryDemo {
    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://localhost:3306/database1";
        String pass = "bablu";
        String user = "root";

        Connection connection = DriverManager.getConnection(URL, user, pass);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from mytable1 where age = 23");

        while (rs.next())
            System.out.println(rs.getString(1)+" "+rs.getInt(2));

    }
}

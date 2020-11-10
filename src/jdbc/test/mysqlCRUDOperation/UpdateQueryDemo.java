package jdbc.test.mysqlCRUDOperation;

import java.sql.*;

public class UpdateQueryDemo {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/database1";
        String userName = "root";
        String pass = "bablu";

        Connection connection = DriverManager.getConnection(URL,userName,pass);
        String sqlQuery = "update mytable1 set age = 21 where name = 'summu'";
        PreparedStatement ps = connection.prepareStatement(sqlQuery);

        // to see the output only
        System.out.println("before updating the table 'mytable1'");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from mytable1");

        while (rs.next()) {
            System.out.println(rs.getString(1) + " "+rs.getInt(2));
        }
        ps.executeUpdate();

        System.out.println("table after updating..");

        rs = st.executeQuery("select * from mytable1");

        while (rs.next()) {
            System.out.println(rs.getString(1) + " "+rs.getInt(2));
        }
    }
}

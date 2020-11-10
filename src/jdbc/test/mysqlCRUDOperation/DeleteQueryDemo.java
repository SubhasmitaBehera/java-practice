package jdbc.test.mysqlCRUDOperation;

import java.sql.*;

public class DeleteQueryDemo {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/database1";
        String pass = "bablu";
        String user = "root";

        Connection connection = DriverManager.getConnection(URL, user, pass);
        String query = "delete from mytable1 where name = 'Bibhu'";
        PreparedStatement ps = connection.prepareStatement(query);

        ps.executeUpdate();

        ResultSet rs = ps.executeQuery("select * from mytable1");

        while (rs.next()) {
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }
    }
}

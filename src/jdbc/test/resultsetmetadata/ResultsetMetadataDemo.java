package jdbc.test.resultsetmetadata;

import java.sql.*;

public class ResultsetMetadataDemo {
    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://localhost:3306/database2";
        String userName = "root";
        String pass = "bablu";

        Connection connection = DriverManager.getConnection(URL,userName,pass);

        PreparedStatement ps = connection.prepareStatement("select * from employee6");

        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

//        ps.executeUpdate();

        System.out.println(rsmd.getColumnCount()); // get number of columns of the table
        System.out.println(rsmd.getTableName(2));
        System.out.println(rsmd.getColumnName(1));
        System.out.println(rsmd.getColumnTypeName(1));
    }
}
